
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		long x=k;
		int c=1;
		while(x<=n) {
			x=k*x;
			c++;
		}
		System.out.println(c);

	}

}
