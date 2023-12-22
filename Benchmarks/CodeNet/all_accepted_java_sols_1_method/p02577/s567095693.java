import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String n = in.next();
		
		
		
		long sum = 0;
		
		for(int i = 0;i<n.length();i++) {
			int num = n.charAt(i) - '0';
			sum = sum + num;
		}
		
		
		
		if(sum % 9 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
