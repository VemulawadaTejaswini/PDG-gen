import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int B[]=new int[N-1];
		int A[]=new int[N];
		int z=0;
		long ans=0;
		while(z<N-1){
			B[z]=stdIn.nextInt();
			z++;
		}z=1;
		ans+=B[0]*2;
		A[0]=B[0];
		A[1]=B[0];
		while(z<N-1){
			if(B[z-1]>B[z]){
				ans-=B[z-1]-B[z];
				ans+=B[z];
				A[z]=B[z];
			}
			else
				ans+=B[z];
			A[z+1]=B[z];
			z++;
		}
		System.out.println(ans);
	}
}