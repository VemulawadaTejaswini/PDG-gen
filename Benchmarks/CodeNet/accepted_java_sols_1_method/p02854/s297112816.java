import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		long min=2020202020;
		long sum=0,sum2=0;
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
			sum2+=A[i];
		}
		for(int i=0;i<N;i++){
			sum2-=A[i];
			sum+=A[i];
			if(Math.abs(sum2-sum)<min)
				min=Math.abs(sum2-sum);
		}
		System.out.println(min);
	}
}
