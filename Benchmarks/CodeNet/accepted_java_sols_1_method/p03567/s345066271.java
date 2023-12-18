import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int i=0;i<S.length()-1;i++) {
			if ("AC".equals(S.substring(i, i+2))) {
				System.out.println("Yes");
				return ;
			}
		}
		System.out.println("No");
	}
}