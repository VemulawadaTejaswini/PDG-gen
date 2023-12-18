import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long min = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			min = Math.min(min, sc.nextLong());
		}
		
		System.out.println((N / min) + 5L - (min == 1 ? 1 : 0));
	}
}
