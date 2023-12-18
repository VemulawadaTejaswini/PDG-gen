import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0,ans=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=1;
		while(z<N-1){
			int a=A[z-1];
			int c=A[z+1];
			int b=A[z];
			if(a<b&&b<c)
				ans++;
			else
				if(a>b&&b>c)
					ans++;
			z++;
		}
		System.out.println(ans);
	}
}