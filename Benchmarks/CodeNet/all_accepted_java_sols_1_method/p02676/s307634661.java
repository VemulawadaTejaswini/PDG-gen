import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int K = in.nextInt();
		String S = in.next();
		
		if(K >= S.length()) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0,K) + "...");
		}
	}
}
