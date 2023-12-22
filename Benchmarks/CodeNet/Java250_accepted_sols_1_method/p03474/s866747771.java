import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int p;
		for(int i=0; i<A; i++) {
			try {
				p = Integer.parseInt(""+S.charAt(i));
			} catch(NumberFormatException e) {
				System.out.println("No");
				return;
			}
		}
		
		if('-' != S.charAt(A)) {
			System.out.println("No");
			return;
		}
		
		for(int i=A+1; i<=A+B; i++) {
			try {
				p = Integer.parseInt(""+S.charAt(i));
			} catch(NumberFormatException e) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
}