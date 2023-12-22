import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		long x=sc.nextLong();
		long a[]=new long[n];
		long sum;
		int counter=0;


		for (int i=0;i<n;++i){
			a[i]=sc.nextLong();
		}

		Arrays.sort(a);
		sum=0;

		for (int i=0;i<n;++i){
			x=x-a[i];
			if(x>=0) ++counter;
			else break;
		}

		if(x<=0)System.out.println(counter);
		if(x>0)System.out.println(counter-1);

	}
}