import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int n = Integer.parseInt(s);
		s = scanner.nextLine();
		int count = 0;
		char last_char = '\0';
		for(int i = 0; i < n; i++){
			char c = s.charAt(i);
			if(last_char != c) {
				count++;
				last_char = c;
			}
		}
		System.out.println(count);
	}

}
