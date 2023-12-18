import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		char a = n.charAt(n.length()-1);

		String ans = "hon";
		if(a == '3') {
			ans = "bon";
		}else if(a == '0' || a == '1' || a == '6' || a == '8') {
			ans = "pon";
		}

		System.out.println(ans);


	}

}