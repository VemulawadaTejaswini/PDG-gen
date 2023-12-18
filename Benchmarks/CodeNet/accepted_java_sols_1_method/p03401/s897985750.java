import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+2];
        arr[0] = 0;
        arr[N+1] = 0;
        int sumArr = 0;
        for(int i = 1; i <=N; i++) {
            arr[i] = sc.nextInt();
            sumArr += Math.abs(arr[i-1] - arr[i]);
        }
        sumArr += Math.abs(arr[N+1] - arr[N]);
        for(int i = 1; i <= N; i++) {
            int diff = Math.abs(arr[i] - arr[i-1]) + Math.abs(arr[i+1] - arr[i]) - Math.abs(arr[i+1] - arr[i-1]);
            System.out.println(sumArr - diff);
        }
    }
}
