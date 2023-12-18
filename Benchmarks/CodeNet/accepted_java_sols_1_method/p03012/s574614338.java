import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] s = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            total += s[i];
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s[i];
            if (min > Math.abs(sum - (total - sum))) {
                min = Math.abs(sum - (total - sum));
            }
        }

        System.out.print(min);
    }

}