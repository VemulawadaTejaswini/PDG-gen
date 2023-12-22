import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[9];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int b = scan.nextInt();
            for (int j = 0; j < a.length; j++) {
                if (b == a[j]) {
                    a[j] = 0;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (a[i] == 0 && a[i + 3] == 0 && a[i + 6] == 0) {
                System.out.println("Yes");
                return;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (a[3 * i] == 0 && a[3 * i + 1] == 0 && a[3 * i + 2] == 0) {
                System.out.println("Yes");
                return;
            }
        }

        if (a[0] == 0 && a[4] == 0 && a[8] == 0) {
            System.out.println("Yes");
            return;
        }

        if (a[2] == 0 && a[4] == 0 && a[6] == 0) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
