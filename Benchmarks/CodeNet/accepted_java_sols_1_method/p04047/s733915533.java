import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * 2];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < n; i++ ) {
            sum += Math.min(arr[i * 2], arr[i * 2 + 1]);
        }
        System.out.println(sum);
    }
}
