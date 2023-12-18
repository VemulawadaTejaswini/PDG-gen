import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int X[]=new int[M];
		int S[]=new int[M];
		long sum=0;
		for(int i=0;i<M;i++){
			X[i]=stdIn.nextInt();
		}
		if(N>=M){
			System.out.println(0);
			System.exit(0);
		}
		Arrays.sort(X);
		for(int i=1;i<M;i++){
			sum+=X[i]-X[i-1];
			S[i-1]=X[i]-X[i-1];
		}
		Arrays.sort(S);
		for(int i=0;i<N-1;i++){
			sum-=S[M-1-i];
		}
		System.out.println(sum);
	}
}
