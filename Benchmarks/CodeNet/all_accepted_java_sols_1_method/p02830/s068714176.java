
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		for (int i=0;i<N;i++) {
			System.out.print(s.charAt(i));
			System.out.print(t.charAt(i));
		}
	}
}
