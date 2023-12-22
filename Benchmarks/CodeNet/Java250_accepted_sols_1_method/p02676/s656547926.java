import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		String S = scan.next();
		int length = S.length();
		char[] s = S.toCharArray(); 
		
		if(K >= length) {
			System.out.println(S);
		}else {
			for(int i = 0; i < K; i++) {
				System.out.print(s[i]);
			}
			System.out.print("...");
		}
		
	}

}
