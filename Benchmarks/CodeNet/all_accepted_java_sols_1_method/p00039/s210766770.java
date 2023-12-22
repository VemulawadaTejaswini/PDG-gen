import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNext() == true) {
			String line = sc.nextLine();
			
			int tmp = 0;
			int state = 0;

			int number = 0;
			for (int i = 0; i < line.length(); i++) {
				switch (line.charAt(i)) {
				case 'I':
					tmp = 1;
					break;
				case 'V':
					tmp = 5;
					break;
				case 'X':
					tmp = 10;
					break;
				case 'L':
					tmp = 50;
					break;
				case 'C':
					tmp = 100;
					break;
				case 'D':
					tmp = 500;
					break;
				case 'M':
					tmp = 1000;
					break;
				}
				
				if ((state != 0) && (tmp > state)) {
					number = number + tmp - state * 2;
					state = 0;
				} else {
					number = number + tmp;
					if ((tmp == 1) || (tmp == 10) || (tmp == 100) || (tmp == 1000)) state = tmp;
				}
			}
			
			System.out.println(number);
		}
	}
}