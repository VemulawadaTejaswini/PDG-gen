import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		if(K >= S.length()) {
			System.out.println(S);
		} else {
			System.out.println(S.substring(0,K)+"...");
		}
	}
}