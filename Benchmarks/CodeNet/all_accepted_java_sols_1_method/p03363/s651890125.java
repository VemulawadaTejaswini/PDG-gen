import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long A[]=new long[N];
		int z=0;
		long y=0,x=1,ans=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			y+=A[z];
			A[z]=y;
			if(A[z]==0)
				ans++;
			z++;
		}z=1;y=1;
		Arrays.sort(A);
		while(z<N){
			if(A[z-1]!=A[z]){
				if(y!=1)
					ans+=x-y;
				y=1;x=1;
			}
			else{
				y++;
				x+=y;
			}
			z++;
		}
		if(y!=1)
			ans+=x-y;
		System.out.println(ans);
	}

}