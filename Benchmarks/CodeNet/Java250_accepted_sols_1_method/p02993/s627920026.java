import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String[] listA = X.split("");
		String ans = "Good";
		for (int i = 0; i < 3; i++) {
			if (listA[i].equals(listA[i + 1])) {
				ans = "Bad";
			}
		}
		System.out.println(ans);
	}
}
