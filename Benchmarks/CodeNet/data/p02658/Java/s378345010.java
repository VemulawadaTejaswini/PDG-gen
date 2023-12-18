import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = scan.nextLong();
			
			if(A[i]==0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		for(int i=1;i<N;i++) {
			A[0] = A[0]*A[i];
			if(A[0]>1000000000000000000L) {
				System.out.println("-1");
				break;
			}
		}
		
		if((A[0]!=0)&(A[0]<=1000000000000000000L)) {
			System.out.println(A[0]);
		}
		
	}

}
