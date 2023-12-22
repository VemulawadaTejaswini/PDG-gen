
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		String S = sc.next();

		int n=S.length();

		if(n<=K) {
			System.out.println(S);
		}else {
			for(int i=0;i<K;i++) {
				System.out.print(S.charAt(i));
			}
			System.out.println("...");
		}



	}
}
