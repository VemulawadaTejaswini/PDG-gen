import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;

        int n = sc.nextInt();

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = n-1; i >= 0; i--) {
            if (i == 0) {
                System.out.printf("%d\n",a[i]);
            } else {
                System.out.printf("%d ", a[i]);
            }
        }

        sc.close();
    }

}
