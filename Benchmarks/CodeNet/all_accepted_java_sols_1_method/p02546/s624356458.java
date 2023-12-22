import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();
			char[]s = S.toCharArray();

			if(s[s.length-1]=='s') {
				System.out.println(S+"es");
			}else {
				System.out.println(S+"s");
			}
		}


	}


}
