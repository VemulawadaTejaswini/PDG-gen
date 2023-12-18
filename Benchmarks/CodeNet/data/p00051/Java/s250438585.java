import java.util.Arrays;
import java.util.Comparator;
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
				numbers[i] = nico.charAt(i) - '0';
			}

			Arrays.sort(numbers);
			
			int max = 0;
			int min = 0;
			
			for (int j = 0; j < nico.length(); j++) {
				max = max * 10 + numbers[i];
			}
			
			for (int j = 0; j < nico.length(); j++) {
				min = min * 10 + numbers[nico.length() - i - 1];
			}
			
			System.out.println(max - min);
		}
	}
}