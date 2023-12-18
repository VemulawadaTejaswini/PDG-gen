import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }

        int[] bit = new int[(int) Math.pow(2, n)];
        boolean judge = false;

        for (int i = 0; i < Math.pow(2, n); i++) {
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    bit[i] += A[j];
                }
            }
        }

        Arrays.sort(bit);

        for (int k = 0; k < q; k++) {
            for (int i = 0; i < Math.pow(2, n); i++) {
                if (bit[i] > m[k]) {
                    break;
                }
                if (bit[i] == m[k]) {
                    judge = true;
                }
            }
            if (judge == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            judge = false;
        }

        sc.close();
    }

}
