import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		
		int K = scr.nextInt();
		String S = scr.next();
		
		if(S.length() <= K) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0,K)+"...");
		}
		
	}
}