
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char b = reader.next().charAt(0);
		String ans = "";
		if (b == 'A') {
			ans = "T";
		}
		if (b == 'T') {
			ans = "A";
		}
		if (b == 'C') {
			ans = "G";
		}
		if (b == 'G') {
			ans = "C";
		}
		reader.close();
		System.out.println(ans);
	}
}



