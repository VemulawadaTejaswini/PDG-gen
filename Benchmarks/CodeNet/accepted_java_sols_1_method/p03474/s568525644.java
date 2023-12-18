import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		sc.close();
		if(S.charAt(A) != '-') {
			System.out.println("No");
		}else {
			for(int i = 0; i < A + B + 1; i++) {
				if(i == A) continue;
				if(S.charAt(i) >= '0' && S.charAt(i) <= '9') {
					continue;
				}else {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
		}
	}
}