import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long[] T = new long[5];
		
		for(int i = 0; i < 5; i++) {
			T[i] = sc.nextLong();
		}
		
		Arrays.sort(T);
		long min = T[0];
		
		long t = 4;
		
		if(N <= min) {
			t += 1;
		} else {
			if(N % min != 0) {
				t += N / min + 1;
			} else {
				t += N / min;
			}
		}
		System.out.println(t);
	}
}
