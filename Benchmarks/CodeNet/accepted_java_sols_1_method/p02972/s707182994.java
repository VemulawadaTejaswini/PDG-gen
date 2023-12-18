import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] or = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            sum = 0;
            int m = i + 1;
            for (int j = m - 1; j < n; j += m) {
                if (or[j] == 1)
                    sum++;
            }
            if (sum % 2 != a[i]) {
                or[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (or[i] == 1)
                count++;
        }
        if (count != 0) {
            System.out.println(count);
            for (int i = 0; i < n; i++) {
                if (or[i] == 1)
                    System.out.print(i + 1 + " ");
            }
            System.out.println();
        } else {
            System.out.println(0);
        }
    }
}