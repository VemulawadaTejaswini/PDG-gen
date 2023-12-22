import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K;
		int[] P = new int [100100];
		for(int i=0; i<N; i++){
			P[i] = sc.nextInt();
		}
		Arrays.sort(P,0,N);


		K = P[N/2] - P[N/2-1];

		System.out.println(K);
	}
}