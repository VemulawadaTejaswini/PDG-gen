import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long m = 100L;
		long y = 0L;
		while (m < x) {
			y++;
			m = m + m / 100;
		}
		System.out.println(y);
	}
}