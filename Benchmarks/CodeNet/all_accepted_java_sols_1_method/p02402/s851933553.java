import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		long sum = 0;
		
		for (int i=0;i<count;i++){
			long t = scanner.nextInt();
			if (t < min) {
				min = t;
			}
			if (t > max) {
				max = t;
			}
			sum = sum + t;
		}
		
		System.out.println(""+ min + " " + max + " " + sum);
		
	}

}