import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String ans1 = "ABC";
		String ans2 = "ARC";

		if(X.contentEquals(ans1)) {
			System.out.println(ans2);
		}else {
			System.out.println(ans1);
		}
	}
}
