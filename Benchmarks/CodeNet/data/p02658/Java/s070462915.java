import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numNumbers = scan.nextInt(); scan.nextLine();
		Scanner line = new Scanner(scan.nextLine());
		long total = 1;
		for(int i = 0; i < numNumbers; i++) {
			total *= line.nextLong();
		}
		if(total > (long) Math.pow(10, 18)) {
			System.out.println(-1);
		}
		else {
			System.out.println((long) total);
		}
	}
}
