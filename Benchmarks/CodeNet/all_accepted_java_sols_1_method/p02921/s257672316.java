import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String P = sc.next();
		String A = sc.next();
		int result = 0;
		for (int i = 0 ; i < 3 ; i++) {
			if (P.substring(i, i+1).equals(A.substring(i, i+1))) {
				result +=1;
			}
		}
		System.out.println(result);
	}
}