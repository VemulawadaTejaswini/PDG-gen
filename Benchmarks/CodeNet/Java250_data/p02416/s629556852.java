import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		char a;
		while(true) {
			input = sc.nextLine();
			if (input.equals("0")) {
				break;
			}
			int sum=0;
			for (int i=0 ; i<input.length() ; i++) {
				a = input.charAt(i);
				sum += a-'0';
			}
			System.out.println(sum + "");
		}
	}

}
