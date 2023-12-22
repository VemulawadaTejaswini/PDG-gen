import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int ans = S.length();
		for(int i = 0; i < ans; i++){
			System.out.print("x");
		}
		stdIn.close();
	}
}