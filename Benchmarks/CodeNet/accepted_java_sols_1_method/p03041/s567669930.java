import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		String  S = sc.next();
		
		String substring = S.substring(K-1, K);
		String lower = substring.toLowerCase();
		
		String front = S.substring(0,K-1);
		String back = S.substring(K,N);
		
		System.out.println(front + lower + back);
		
		sc.close();
		
	}

}
