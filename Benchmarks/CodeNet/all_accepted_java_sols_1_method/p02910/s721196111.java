import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = null;
		
		try {
			String[] sp = scanner.nextLine().split(" ");
			s = sp[0];
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}
		scanner.close();
		for(int i = 0; i < s.length(); i++) {
			if((i + 1) % 2 == 1) {
				if(s.charAt(i) != 'R' && s.charAt(i) != 'U' && s.charAt(i) != 'D') {
					System.out.println("No");
					return;
				}
			} else {
				if(s.charAt(i) != 'L' && s.charAt(i) != 'U' && s.charAt(i) != 'D') {
					System.out.println("No");
					return;
				}
			}
		}
		
		
	 	System.out.println("Yes");
	}
}