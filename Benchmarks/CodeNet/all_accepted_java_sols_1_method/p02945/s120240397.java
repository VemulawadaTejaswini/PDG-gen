import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = A + B,
            b = A - B,
            c = A * B;

        if (a < b) {
            if (b < c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else {
            if (a < c) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        }
    }
}