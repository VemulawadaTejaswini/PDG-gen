import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int S[][]=new int[N][2];
		long sum=0;
		boolean fin=false;
		int z=0;
		while(z<N){
			S[z][1]=stdIn.nextInt();
			S[z][0]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(S, (a, b) -> Integer.compare(a[0], b[0]));
		while(z<N){
			sum+=S[z][1];
			if(sum>S[z][0]){
				fin=true;
				break;
			}
			z++;
		}
		if(fin)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}