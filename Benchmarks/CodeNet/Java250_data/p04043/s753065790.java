import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int A;
        int B;
        int C;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();

        }
        if (A != 5 && A != 7) {
            System.out.println("NO");
            return;
        }
        if (B != 5 && B != 7) {
            System.out.println("NO");
            return;
        }
        if (C != 5 && C != 7) {
            System.out.println("NO");
            return;
        }
        if (A + B + C != 17) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

    }

}
