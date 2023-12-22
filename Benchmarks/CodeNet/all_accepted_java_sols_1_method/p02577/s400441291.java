import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String n = scan.next();
		int length = n.length();
		char[] n_list = n.toCharArray();
		long sum = 0;

		for(int i = 0; i < length;i++) {
			sum += (int)n_list[i] - (int)'0';
		}

		if(sum % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
