import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        StringBuilder a_str = new StringBuilder();
        StringBuilder b_str = new StringBuilder();
        for(int i = 0; i < a; i++) {
            a_str.append(b);
        }
        for(int i = 0; i < b; i++) {
            b_str.append(a);
        }
        System.out.println(a_str.toString().compareTo(b_str.toString()) < 0? a_str.toString():b_str.toString());
    }
}