import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int price = 700;
		for(int i = 0; i < 3; i++) {
			if(s.charAt(i) == 'o') {
				price = price + 100;
			}
		}
		System.out.println(price);
	}
}