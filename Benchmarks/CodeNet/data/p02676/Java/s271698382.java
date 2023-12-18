import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		String S = stdIn.next();
		if(S.length() > K){
			System.out.println(S.substring(0, K) + "...");
		}
		else{
			System.out.println(S);
		}
		stdIn.close();
	}
}