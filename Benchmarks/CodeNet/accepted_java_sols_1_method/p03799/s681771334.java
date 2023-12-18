import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long min = Math.min(n, m/2);
		System.out.println(min+(m-2*min)/4);
	}

}
