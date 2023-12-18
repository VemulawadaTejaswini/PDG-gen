import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        boolean flag = true;
        int m = 0;
        while (flag) {
            flag = false;
            for (int i = n - 1; i >= 1; i--) {
                if (a[i] < a[i-1]) {
                    int tmp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = tmp;
                    m++;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println(a[n-1]);
        System.out.println(m);
        scanner.close();
    }
}

