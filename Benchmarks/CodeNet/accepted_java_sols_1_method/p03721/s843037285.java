import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[100001];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a] += b;
        }

        long sum = 0;
        for (int i = 0; i < 100001; i++) {
            sum += arr[i];
            if (k <= sum) {
                System.out.print(i);
                return;
            }
        }
    }

}
