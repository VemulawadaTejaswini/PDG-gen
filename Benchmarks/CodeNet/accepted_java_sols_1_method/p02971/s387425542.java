import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int[] a = new int[n];
        int max1 = 0;
        int max1Idx = 0;
        int max2 = 0;
        int max2Idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (max1 <= a[i]) {
                max2 = max1;
                max2Idx = max1Idx;
                max1 = a[i];
                max1Idx = i;
            } else if (max2 <= a[i]) {
                max2 = a[i];
                max2Idx = i;
            }
        }
        final StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i == max1Idx) {
                ans.append(max2);
                ans.append("\n");
            } else {
                ans.append(max1);
                ans.append("\n");
            }
        }
        System.out.print(ans);
    }
}
