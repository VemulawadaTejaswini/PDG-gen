import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String str = scan.nextLine();
			
			if(str.equals("0")) {
				break;
			}
			
			int sum = 0;
			for(char c : str.toCharArray()) {
				sum += c - 48;
			}
			
			System.out.println(sum);
		}
		
		scan.close();
	}
}

