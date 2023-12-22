import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		
		int J = K -1;
		String str = S.substring(J,J + 1);
		String str2 = str.toLowerCase();
		
		int num = S.length();
		
		System.out.print(S.substring(0,J));
		System.out.print(str2);
		System.out.println(S.substring(K,N));
		
		
	}
}