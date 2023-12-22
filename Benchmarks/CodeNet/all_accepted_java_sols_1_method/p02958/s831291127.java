import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int p[]=new int[N];
		int n[]=new int[N];
		int z=0,ans=0;
		while(z<N){
			p[z]=stdIn.nextInt();
			n[z]=p[z];
			z++;
		}z=0;
		Arrays.sort(n);
		while(z<N){
			if(p[z]!=n[z])
				ans++;
			if(ans>3)
				break;
			z++;
		}z=0;
		if(ans<3)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}