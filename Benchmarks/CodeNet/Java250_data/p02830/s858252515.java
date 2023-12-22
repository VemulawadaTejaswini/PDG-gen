import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String S = stdIn.next();
		String T = stdIn.next();
		for(int i = 0; i < N; i++){
			System.out.print(S.charAt(i) + "" + T.charAt(i));
		}
		stdIn.close();
	}
}