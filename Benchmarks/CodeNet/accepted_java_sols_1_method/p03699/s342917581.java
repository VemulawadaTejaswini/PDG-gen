import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
            if (s[i] % 10 != 0) min = Math.min(min, s[i]);
        }

        if (sum % 10 != 0) {
            System.out.println(sum);
        } else {
            if (min != Integer.MAX_VALUE) {
                System.out.println(sum - min);
            } else {
                System.out.println(0);
            }
        }
    }
}
