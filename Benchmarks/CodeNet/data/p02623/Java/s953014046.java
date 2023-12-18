import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        boolean flg = true;
        int temp_n = 0;
        int temp_m = 0;
        int time = K;
        int ans = 0;
        while (flg) {
            if (temp_n == N) {
            	if (temp_m == M) {
            		break;
            	}
                time = Math.max(time-B[temp_m], 0);
                temp_m++;
            } else if (temp_m == M) {
            	if (temp_n == N) {
            		break;
            	}
                time = Math.max(time-A[temp_n], 0);
                temp_n++;
            } else if (A[temp_n] > B[temp_m]) {
                time = Math.max(time - B[temp_m], 0);
                temp_n++;
            } else {
                time = Math.max(time - A[temp_n], 0);
                temp_m++;
            }

            if (time <= 0) {
            	flg = false;
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}