
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		String ans = "No";

		for (int i = 0; i < S.length(); i++){
			S = S.substring(S.length() - 1) + S.substring(0,S.length() - 1);
			if (S.equals(T)){
				ans = "Yes";
				break;
			}
		}
		System.out.println(ans);
	}
}