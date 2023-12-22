import java.util.Scanner;

/**
 * Main
 */

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long remain = 0;
        long need = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                need += (a[i] - b[i]);
            } else {
                remain += ((b[i] - a[i]) / 2);
            }
        }
        if (remain >= need) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
