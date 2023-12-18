import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		StringBuffer line = new StringBuffer(sc.nextLine());
		for (; !line.toString().equals("0");) {
			int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				sum += ch - '0';
			}
			System.out.println(sum);
			
			line = new StringBuffer(sc.nextLine());
		}
		
		sc.close();
	}
}