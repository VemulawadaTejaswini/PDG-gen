import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		
		long sum = 0;
		for (long i = 1; i <= num; i++) {
			if (i % 3 != 0 && i%5 != 0) {
				sum += i;
			}
			
		}
		
		System.out.println(sum);

	}
}