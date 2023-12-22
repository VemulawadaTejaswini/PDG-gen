import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(new Main().tap_dance(scanner.nextLine()));
		scanner.close();
	}
	
	public String tap_dance(String str) {
		int i;
		for(i = 0; i < str.length(); i++) {
			if((i + 1) % 2 == 1) {
				if(str.charAt(i) == 'L') {
					return "No";
				}
			}else {
				if(str.charAt(i) == 'R') {
					return "No";
				}
			}
		}
		return "Yes";
	}
}
