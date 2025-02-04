import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long A[] = new long[N];
        long ans = 0;
        long ans2 = 0;
        Arrays.fill(A, 0);

        for(int cnt = 0; cnt < N; cnt++){
        	A[cnt] = in.nextLong();
        }

        Arrays.sort(A);

        for(int cnt = N - 1; cnt > 0; cnt--){
        	if(A[cnt] == A[cnt-1]){
        		if(A[cnt] > ans){
        			ans = A[cnt];
        			cnt--;
        		}
        		else if(A[cnt] > ans2){
        			ans2 = A[cnt];
        			cnt--;
        		}
        	}
        }
        System.out.println(ans * ans2);

    }
}