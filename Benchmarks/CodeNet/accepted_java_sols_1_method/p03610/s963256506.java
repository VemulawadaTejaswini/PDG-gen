import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}