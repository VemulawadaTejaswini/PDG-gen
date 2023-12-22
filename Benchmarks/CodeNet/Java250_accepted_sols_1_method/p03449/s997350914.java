import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();

        }
        int result = 0;
        int before = 0;
        for (int i = 0; i < n; i++) {
            int candies = a1[i] + before;

            for (int j = i; j < n; j++) {
                candies += a2[j];
            }

            if (candies > result) {
                result = candies;
            }

            before += a1[i];
        }
        System.out.println(result);
    }
}