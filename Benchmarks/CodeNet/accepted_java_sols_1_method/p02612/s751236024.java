import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long m = N / 1000;
		if (m * 1000 == N) {
			System.out.println(0);
		} else {
			m = m + 1;
			m = m * 1000;
			System.out.println(m - N);
		}
	}
}