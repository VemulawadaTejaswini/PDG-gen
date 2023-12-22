
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		long n=ob.nextLong();
		long x=ob.nextLong();
		long t=ob.nextLong();
		long ans=(long)Math.ceil(n*(1.0)/x);
		System.out.println(ans*t);
	}
}
