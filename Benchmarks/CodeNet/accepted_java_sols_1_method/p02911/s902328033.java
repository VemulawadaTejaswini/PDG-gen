import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int Q = scan.nextInt();
		int[] A = new int[N];
		for(int i=0;i<Q;i++){
			A[scan.nextInt()-1]++;
		}
		for(int i=0;i<N;i++){
			if(A[i]+K-Q>0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}