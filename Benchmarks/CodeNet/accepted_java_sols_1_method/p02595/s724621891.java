
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		double d=sc.nextDouble();
		int c=0;
		for(int i=0;i<n;i++) {
			long x=sc.nextLong();
			long y=sc.nextLong();
			double a=Math.sqrt((x*x)+(y*y));
			if(d>=a)
				c++;
		}
		System.out.println(c);





	}

}