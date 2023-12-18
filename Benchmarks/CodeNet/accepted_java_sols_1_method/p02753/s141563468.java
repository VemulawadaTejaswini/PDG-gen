import java.util.Scanner;

//AtCoder Beginner Contest 158
//A Station and Bus
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		if (S.equals("AAA") || S.equals("BBB") ) {
			System.out.print("No");
		} else {
			System.out.print("Yes");
		}
	}
}
