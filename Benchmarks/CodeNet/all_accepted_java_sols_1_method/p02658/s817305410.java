import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		long ans = 1;
		long []A = new long[N];
		for(int a = 0; a < N; a++){
			A[a] = stdIn.nextLong();
		}
		for(int b = 0; b < N; b++){
			if(A[b] == 0){
				ans = 0;
				break;
			}
			else if(A[b] > (long)Math.pow(10, 18)/ans){
				ans = -1;
			}
			else{
				ans *= A[b];
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}