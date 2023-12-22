import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ans;
		Scanner scn = new Scanner(System.in);
		String N = scn.nextLine();
		char n = N.charAt(N.length()-1);
		if(n == '3') {
			ans = "bon";
		}else if(n == '0' || n == '1' || n == '6' || n == '8') {
			ans = "pon";
		}else {
			ans = "hon";
		}
		System.out.print(ans);
	}
}
