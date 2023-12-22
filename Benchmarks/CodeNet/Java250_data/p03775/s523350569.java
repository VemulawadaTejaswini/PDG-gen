import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long min = (long)Math.pow(10,11);
		
		for(long i = 1; i * i<= N; i++) {
			if(N % i == 0) {
				if(getMax(i, N / i) < min) {
					min = getMax(i, N / i);
				}
			}
		}
		
		System.out.println(min);
		
		scan.close();

	}
	
	public static int getMax(long A, long B) {
		if(Long.toString(A).length() > Long.toString(B).length()) {
			return Long.toString(A).length();
		} else {
			return Long.toString(B).length();
		}
	}

}
