import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0;i<N;i++) {
			String s =sc.next();
			if ("Y".equals(s)) {
				System.out.println("Four");
				return;
			}
		}
		System.out.println("Three");
	}

}