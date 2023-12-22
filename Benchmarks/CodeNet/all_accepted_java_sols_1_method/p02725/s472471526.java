
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[N];
        for (int i = 1; i < N; i++) {
            arr2[i-1] = arr[i]-arr[i-1];
            K -= arr2[i-1];
        }
        arr2[N-1] = K;

        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            sum += arr2[i];
        }
        
        int ans = sum;
        for (int i = 1; i < N; i++) {
            sum -= arr2[i-1];
            sum += arr2[(N-2+i)%N];
            ans = Math.min(ans, sum);
        }

        System.out.println(ans);

        sc.close();
	}
}