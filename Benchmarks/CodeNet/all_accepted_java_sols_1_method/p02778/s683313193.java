import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = S.length();
		String X = "";
		for(int i =0; i<n; i++) {
			X = X + "x";
		}
		
		System.out.println(X);
}
}