
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b =sc.nextDouble();
		double c=a*b;
		
		long k=(long) Math.abs(c);
		
		System.out.println(k);
		
		
		sc.close();
	}
}
