import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N+1];
		int B[]=new int[N];
		int z=0;
		long ans=0;
		while(z<N+1){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N){
			B[z]=stdIn.nextInt();
			if(A[z]>=B[z])
				ans+=B[z];
			else{
				ans+=A[z];
				B[z]-=A[z];
				if(A[z+1]>=B[z]){
					A[z+1]-=B[z];
					ans+=B[z];
				}
				else{
					ans+=A[z+1];
					A[z+1]=0;
				}
			}
			z++;
		}z=0;
		System.out.println(ans);
	}
}