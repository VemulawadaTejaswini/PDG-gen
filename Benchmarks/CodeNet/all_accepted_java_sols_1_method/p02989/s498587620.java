import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int d[]=new int[N];
		int z=0;
		while(z<N){
			d[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(d);
		System.out.println(d[N/2]-d[N/2-1]);
	}
}