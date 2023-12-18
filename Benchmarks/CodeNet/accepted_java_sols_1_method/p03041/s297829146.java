import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		System.out.println(S.substring(0,K-1)+Character.toLowerCase(S.charAt(K-1))+S.substring(K));
	}

}
