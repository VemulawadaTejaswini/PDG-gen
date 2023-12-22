import java.util.Arrays;
import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int A[]=new int[N];
		int sum=0;
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
			sum+=A[i];
		}
		Arrays.sort(A);
		for(int i=0;i<M;i++){
			if(A[N-i-1]*4*M<sum){
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
