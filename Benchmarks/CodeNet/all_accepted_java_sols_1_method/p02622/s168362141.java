import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String P = sc.next();
		int count =0;
		for (int i=0;i<S.length();i++) {
			if (S.charAt(i)!=P.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
