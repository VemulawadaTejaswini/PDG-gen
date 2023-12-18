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
		for (int i = 0; i < lines; i++) {
			String nico = sc.nextLine();
			
			int[] numbers = new int[nico.length()];
			for (int j = 0; j < nico.length(); j++) {
				numbers[j] = nico.charAt(j) - '0';
			}

			Arrays.sort(numbers);

			int min = 0;
			int max = 0;
			
			for (int j = 0; j < nico.length(); j++) {
				min = min * 10 + numbers[j];
				max = max * 10 + numbers[nico.length() - j - 1];
			}

			System.out.println(max - min);
		}
	}
}