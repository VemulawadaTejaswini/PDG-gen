import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.length();
        String x = "";
        for(int i=0; i<a; i++) {
            x = x + "x";
        }
        System.out.println(x);
    }
}