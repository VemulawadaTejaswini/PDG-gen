import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N    = scanner.nextInt();
		int K    = scanner.nextInt();
		String S = scanner.next();
		String answer = "";
			
		answer =  S.substring(0,K-1) + S.substring(K-1,K).toLowerCase() + S.substring(K);
		
		
		System.out.println(answer);
	}
}