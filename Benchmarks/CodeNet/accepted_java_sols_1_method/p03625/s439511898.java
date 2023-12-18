import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int z=0;
		long x=0,y=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=N-1;
		Arrays.sort(A);
		while(z>0){
			if(A[z]==A[z-1]){
				if(y==0)
					y=A[z];
				else
					if(x==0)
						x=A[z];
					else
						break;
				z--;
			}
			z--;
		}
		if(x==0||y==0)
			System.out.println(0);
		else
			System.out.println(y*x);
	}
}
