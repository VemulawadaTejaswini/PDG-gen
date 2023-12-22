import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String T = sc.next();

		String H = T.substring(0, T.length()-1);

		if(X.equals(H)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
