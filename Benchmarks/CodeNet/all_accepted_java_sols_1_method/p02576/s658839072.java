import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		long t = Long.parseLong(sc.next());
		long result = 0;
		
		long time = n/x;
		long rest = n%x;
		result += t*time;
		if (rest > 0) {
			result +=t;
		}
		
		System.out.println(result);
	}



}
