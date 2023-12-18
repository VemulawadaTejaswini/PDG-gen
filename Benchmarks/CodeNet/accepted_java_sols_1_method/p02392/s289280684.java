import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		String ans = "";

		if (a < b) {
			if(b < c) {
				ans = "Yes";
			}else {
				ans = "No";
			}
		} else {
			ans = "No";
		}

		System.out.println(ans);
	}

}

