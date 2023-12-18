
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minA = Math.min(minA, a[i]);
        }

        boolean isPairwise = false;
        boolean isSetwise = false;
        for (int i = 2; i <= Math.sqrt(minA); i++) {
            boolean isOK = true;
            int setwiseCount = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] % i != 0) {
                    isOK = false;
                } else {
                    setwiseCount++;
                }
            }

            if (setwiseCount >= 2) {
                isSetwise = true;
            }

            if (isOK) {
                isPairwise = true;
                break;
            }
        }

        if (isPairwise) {
            System.out.println("not coprime");
        } else if (isSetwise) {
            System.out.println("setwise coprime");
        } else {
            System.out.println("pairwise coprime");
        }

    }
}
