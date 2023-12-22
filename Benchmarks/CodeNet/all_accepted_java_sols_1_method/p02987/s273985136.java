import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		for (char d : c) {
			int count=0;
			for (char e : c) {
				if(d==e) count++;
			}
			if(count != 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
