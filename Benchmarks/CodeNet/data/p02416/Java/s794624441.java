import java.util.Scanner;

public class Main {
	
	static int digit(String num) {
		int sum = 0;
		for(int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			int digit = ch - '0';
			sum += digit;
		}
		return sum;
	}
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String num = sc.nextLine();
			if(num.equals("0")) {
				break;
			}
			System.out.println(digit(num));
		}
		sc.close();
	}

}

