import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];
        int sum = 0;
        int cur = 0;
        arr[n] = 0;
        arr[n + 1] = 0;

        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
            sum += Math.abs(cur - arr[i]);
            cur = arr[i];
        }
        sc.close();

        sum += Math.abs(cur);

        for (int i = 1; i <= n; i++) {
            System.out.println(sum - Math.abs(arr[i - 1] - arr[i]) - Math.abs(arr[i] - arr[i + 1])
                    + Math.abs(arr[i - 1] - arr[i + 1]));
        }
    }
}