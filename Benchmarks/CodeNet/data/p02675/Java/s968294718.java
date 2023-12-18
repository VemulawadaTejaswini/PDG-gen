
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		String S = "";
		if(N.charAt(N.length()-1) == '2' ||
				N.charAt(N.length()-1) == '4' ||
				N.charAt(N.length()-1) == '5' ||
				N.charAt(N.length()-1) == '7' ||
				N.charAt(N.length()-1) == '9') {
			S = "hon";
		}else if(N.charAt(N.length()-1) == '0' ||
				N.charAt(N.length()-1) == '1' ||
				N.charAt(N.length()-1) == '6' ||
				N.charAt(N.length()-1) == '8') {
			S = "pon";
		}else {
			S = "bon";
		}

		System.out.println(S);
	}

}