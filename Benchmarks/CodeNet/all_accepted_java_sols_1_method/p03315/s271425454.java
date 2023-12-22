import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i <=3; i++) {
			if ( S.charAt(i) == '+') {
				count1 ++;
			} else {
				count2 ++;
			}
		}
		System.out.println( (1*count1) + (-1*count2) );
	}
}