import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int countA = sc.nextInt();
		int countB = sc.nextInt();
		String U = sc.next();
		if (S.equals(U)==true) {
			System.out.println(countA-1);
			System.out.println(countB);
		} else {
			System.out.println(countA);
			System.out.println(countB-1);
		}
	}
}