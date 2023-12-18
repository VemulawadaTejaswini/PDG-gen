import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = N*(N-1)/2 - N/2;
		System.out.println(M);
		for(int i=1; i<N; i++) {
			for(int j=i+1; j<=N; j++) {
				if(i+j != (N/2*2+1))
					System.out.println(i+" "+j);
			}
		}
		
		sc.close();
	}
}
