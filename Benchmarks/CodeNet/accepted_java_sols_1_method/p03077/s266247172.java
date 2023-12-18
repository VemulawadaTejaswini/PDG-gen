import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] teiin = new long[5];
		long min  = 10000000000000000L;
		for (int i = 0; i < 5; i++) {
			teiin[i] = sc.nextLong();
			if (teiin[i] < min) {
				min = teiin[i];
			}
		}
		System.out.println((n + min - 1) / min + 4);
	}
}