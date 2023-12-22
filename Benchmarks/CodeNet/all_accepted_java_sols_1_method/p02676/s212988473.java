import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		String s = scan.next();

		String ans = s;

		if(s.length() > k) {
			ans = s.substring(0, k) + "...";
		}

		System.out.println(ans);


	}

}