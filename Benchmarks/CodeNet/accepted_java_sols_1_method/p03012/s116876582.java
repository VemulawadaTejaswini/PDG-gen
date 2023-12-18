import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lis = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
            sum += lis[i];
        }


        int sum2 = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            sum -= lis[i];
            sum2 += lis[i];
            min = Math.min(min, Math.abs(sum - sum2));
        }
        System.out.println(min);
    }
}
