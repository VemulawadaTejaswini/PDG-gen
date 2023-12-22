import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		long sum=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			if(z==0)
				sum=A[z];
			else
				sum=A[z]-sum;
			z++;
		}z=0;
		System.out.println(sum);
		while(z<N-1){
			sum/=2;
			sum=(A[z]-sum)*2;
			System.out.println(sum);
			z++;
		}
	}
}