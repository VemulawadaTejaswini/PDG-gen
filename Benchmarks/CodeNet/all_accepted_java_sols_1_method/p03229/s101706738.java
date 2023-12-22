import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N;
	static long[] T;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 T = new long[N];
			 for(int i = 0 ; i < N ; i++){
				 T[i] = sc.nextInt();
			 }
		  sc.close();

		  Arrays.sort(T);

		  long ans = T[((N-1))] - T[0];

		  for(int i = 0 ; i < (N-2)/2 ; i++){
			  ans += T[((N-1)-i)] - T[i+1];
			  ans += T[((N-1)-i-1)] - T[i];

		  }
		  if(N%2 != 0){
			  ans += Math.max(T[(N/2)+1]-T[N/2], T[N/2]-T[(N/2)-1]);
		  }
		  System.out.println(ans);
	}
}