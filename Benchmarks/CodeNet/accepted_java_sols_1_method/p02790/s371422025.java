import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		StringBuffer sbA = new StringBuffer();
		StringBuffer sbB = new StringBuffer();
		for(int i = 0; i < b; i++) {
			String S = String.valueOf(a);
			sbA.append(S);
		}
		for(int i = 0; i < a; i++) {
			String S = String.valueOf(b);
			sbB.append(S);
		}
		String A = sbA.toString();
		String B = sbB.toString();
		if(a < b) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
}