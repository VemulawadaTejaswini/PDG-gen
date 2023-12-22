import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		System.out.println(S.substring(0,N/2).equals(S.substring(N/2, N)) ? "Yes" : "No");
	}
}