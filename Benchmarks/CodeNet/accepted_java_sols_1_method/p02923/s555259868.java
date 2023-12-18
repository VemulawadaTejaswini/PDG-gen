import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int max = 0;
        int cur = 0;
        for(int i = N-2; i >= 0; i--) {
            if(arr[i] >= arr[i+1]) {
                cur++;
            } else {
                cur = 0;
            }
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}
