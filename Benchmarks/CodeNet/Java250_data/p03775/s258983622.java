import java.util.*;
public class Main {
	public static int f(long A, long B) {
		int a = (int)String.valueOf(A).length();
		int b = (int)String.valueOf(B).length();
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		
		int min = f(1, N);
		for(int i = 1; i < Math.sqrt(N)+1; i++) {
			if(N%i == 0) {
				min = Math.min(min, f(i, N/i));
			}
		}
		
		System.out.println(min);

	}

}