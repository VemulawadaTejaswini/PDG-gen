import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		int a;
		int min=1000000;
		int max=-1000000;
		long sum=0;
		int f=sc.nextInt();
		for(;sc.hasNext();){
			a=sc.nextInt();
			sum+=a;
			if(a<=min)min=a;
			if(a>=max)max=a;
			
		}
		System.out.printf("%d %d %d%n",min,max,sum);
		
	}
}