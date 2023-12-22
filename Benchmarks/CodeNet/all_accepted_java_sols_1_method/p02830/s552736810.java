import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		sc.close();
		String U = "";
		for(int i=0; i<N; i++) {
			U += S.charAt(i);
			U += T.charAt(i);
		}
		System.out.println(U);
	}

}