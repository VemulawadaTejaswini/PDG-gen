
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        boolean isContainOne = false;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
            if (a[i] == 1) {
                isContainOne = true;
            }
        }
        scan.close();

        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, a[i]);
        }

        boolean isThree = false;
        for (int i = 2; i <= Math.sqrt(maxA); i++) {
            boolean isOK = true;
            for (int j = 0; j < n; j++) {
                if (a[j] % i != 0) {
                    isOK = false;
                }
            }

            if (isOK) {
                isThree = true;
                break;
            }
        }
        boolean isOK = true;
        for (int j = 0; j < n; j++) {
            if (a[j] % maxA != 0) {
                isOK = false;
            }
        }
        if (isOK && !isContainOne) {
            isThree = true;
        }

        if (isThree) {
            System.out.println("not coprime");
            return;
        }

        boolean isTwo = false;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                if (a[i] % j == 0) {
                    if (set.contains(j)) {
                        isTwo = true;
                        break;
                    }

                    set.add(j);
                    while (a[i] % j == 0) {
                        a[i] /= j;
                    }
                }
            }
            set.add(a[i]);

            if (isTwo) {
                break;
            }
        }

        if (isTwo) {
            System.out.println("setwise coprime");
        } else {
            System.out.println("pairwise coprime");
        }

    }
}
