import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String s = sc.next();
		
		System.out.println( s.substring(0,K-1)+s.substring(K-1, K).toLowerCase()+s.substring(K,N));
	}
}
