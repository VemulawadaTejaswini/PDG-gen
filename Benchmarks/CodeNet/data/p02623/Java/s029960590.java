import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		long K=scan.nextLong();

		long[] A = new long[N+1];
	    long[] B = new long[M+1];
	     A[0]=0;
	     B[0]=0;

	     for(int i=1;i<=N;i++){
	       A[i] = A[i-1]+scan.nextLong();
	     }
	     for(int i=1;i<=M;i++){
	       B[i] = B[i-1]+scan.nextLong();
	     }


	      int j = M;

	      int count = 0;
	      for(int i=0;i<=N;i++){
	        if(A[i]>K){
	          break;
	        }
	        while(A[i]+B[j]>K){
	          j--;
	        }
	         count = Math.max(count,i+j);
	      }
			System.out.println(count);
	}
}
