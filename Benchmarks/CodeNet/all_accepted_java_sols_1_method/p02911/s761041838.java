import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N,K,Q;
		N=scan.nextInt();
		K=scan.nextInt();
		Q=scan.nextInt();
		int A[]=new int[N];
		int i,a;
		for(i=0;i<N;i++){
			A[i]=0;
		}
		for(i=0;i<Q;i++){
			a=scan.nextInt();
			A[a-1]++;
		}
		for(i=0;i<N;i++){
			A[i]=A[i]+K-Q;
			if(A[i]>0)System.out.println("Yes");
			else System.out.println("No");
		}
		
	}
}