
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        boolean isPairwise = true;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int curA = a[i];
            for (int j = 2; j <= Math.sqrt(curA); j++) {
                if (curA % j == 0) {
                    if (set.contains(j)) {
                        isPairwise = false;
                        break;
                    }

                    set.add(j);
                    while (curA % j == 0) {
                        curA /= j;
                    }
                }
            }

            if (curA >= 2) {
                if (set.contains(curA)) {
                    isPairwise = false;
                } else {
                    set.add(curA);
                }
            }

            if (!isPairwise) {
                break;
            }
        }

        if (isPairwise) {
            System.out.println("pairwise coprime");
            return;
        }

        int gcd = a[0];
        for (int i = 1; i < n; i++) {
            gcd = calcGcd(gcd, a[i]);
        }

        if (gcd == 1) {
            System.out.println("setwise coprime");
        } else {
            System.out.println("not coprime");
        }

    }

    private static int calcGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return calcGcd(b, a % b);
        }
    }
}
