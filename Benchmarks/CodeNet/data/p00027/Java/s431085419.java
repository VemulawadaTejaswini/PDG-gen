import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
		
		while (true) {
			int m = scan.nextInt();
			int d = scan.nextInt();
			if ((m | d) == 0) break;
			
			int sum = d;
			for (int i = 0; i < m - 1; i++) sum += month[i];
			
			System.out.println(week[sum % 7]);
		}
	}
	
	private void debug() {
		System.out.println();
	}
}