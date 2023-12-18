import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				k++;
			}
		}

		int result = 0;
		for (int i = 0; i < k; i++) {
			if (s.charAt(i) == 'W') {
				result++;
			}
		}
		System.out.println(result);
	}

	//WRWWRWRR
	//RRRRWWWW

}
