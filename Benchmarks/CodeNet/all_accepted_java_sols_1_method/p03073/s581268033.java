
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputS = scanner.nextLine();

		scanner.close();
		
		char correct = inputS.charAt(0);
		if(correct == '0') {
			correct = '1';
		} else {
			correct = '0';
		}
		
		int turnCount = 0;
		for(int i = 1; i < inputS.length(); i++) {
			if(correct - inputS.charAt(i) != 0) {
				turnCount++;
			}

			if(correct == '0') {
				correct = '1';
			} else {
				correct = '0';
			}
		}
		
		System.out.println(turnCount);
	}
}