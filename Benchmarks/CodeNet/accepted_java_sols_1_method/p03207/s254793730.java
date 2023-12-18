import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int z=0,y=0;
		int a[]=new int[N];
		while(z<N){
			a[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(a);
		while(z<N){
			if(z==N-1)
				a[z]/=2;
			y+=a[z];
			z++;
		}
		System.out.println(y);
	}
}
