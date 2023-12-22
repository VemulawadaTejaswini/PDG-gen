import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = (int)Math.pow(10, 5) - 10000;
        int b = (int)Math.pow(10, 3) - 100;
        int c = (int)Math.pow(10, 1) - 1;
        int length = String.valueOf(n).length();
        if (length == 6) {
            System.out.println(a + b + c);
        } else if (length == 5) {
            System.out.println((n - (int)Math.pow(10, 4) + 1) + b + c);
        } else if (length == 4) {
            System.out.println(b + c);
        } else if (length == 3) {
            System.out.println((n - (int)Math.pow(10, 2) + 1) + c);
        } else if (length == 2) {
            System.out.println(c);
        } else {
            System.out.println(n);
        }
    }
}