import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int alice = 0;
        int bob = 0;
        for (int j = 0; j < n; j++) {
            int max = 0;
            for (int k = 0; k < n; k++) {
                max = Math.max(max, a[k]);
            }
            for (int l = 0; l < n; l++) {
                if (max == a[l]) {
                    a[l] = 0;
                    break;
                }
            }

            if (j % 2 == 0) {
                alice += max;
            } else {
                bob += max;
            }
        }

        System.out.println(alice - bob);
    }
}