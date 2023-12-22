import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int K = a.nextInt();
		String S = a.next();
		if(K >= S.length()) {
			System.out.println(S);
		}else {
			String SS = S.substring(0,K);
			System.out.println(SS + "...");
		}
	}
}