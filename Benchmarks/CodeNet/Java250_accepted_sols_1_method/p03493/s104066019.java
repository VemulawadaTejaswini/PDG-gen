import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hundreds = sc.next();
		int count = 0;
		
		for(int i = 0; i < 3; i++) {
			if (hundreds.charAt(i) == '1') {
				count++;
			
			}
		}
		
		System.out.println(count);
	}

}