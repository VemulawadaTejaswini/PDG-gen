import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());

		int[] wait = new int[lines];
		for (int i = 0; i < lines; i++) {
			wait[i] = Integer.parseInt(sc.nextLine());
			Arrays.sort(wait);
		}
		
		int sum = 0;
		for (int i = 0; i < lines; i++) {
			sum = sum + (lines - i - 1) * wait[i];
		}
		System.out.println(sum);
	}
}