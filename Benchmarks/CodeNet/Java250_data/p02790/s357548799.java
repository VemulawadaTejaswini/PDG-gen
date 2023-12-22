import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());

		String a_s = String.valueOf(a);
		String b_s = String.valueOf(b);

		String resultA = "";
		String resultB = "";

		for(int i = 0; i<a; ++i) {
			resultB += b_s;
		}

		for(int i = 0; i<b; ++i) {
			resultA += a_s;
		}

		if(a > b) {
			System.out.println(resultB);
		} else {
			System.out.println(resultA);
		}
	}
}
