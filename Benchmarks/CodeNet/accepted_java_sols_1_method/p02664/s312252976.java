import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		for (int i=0;i<T.length();i++) {
			if (T.charAt(i)=='?') {
				System.out.print('D');
			} else {
				System.out.print(T.charAt(i));
			}
		}
	}
}