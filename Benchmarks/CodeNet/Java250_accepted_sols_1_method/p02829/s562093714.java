import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String answer = null;
 
		if(A.equals("1") && B.equals("2")) {
			answer = "3";
		} else if (A.equals("1") && B.equals("3")) {
			answer = "2";
		} else if (A.equals("2") && B.equals("1")) {
			answer = "3";
		} else if (A.equals("2") && B.equals("3")) {
			answer = "1";
		} else if (A.equals("3") && B.equals("1")) {
			answer = "2";
		} else if (A.equals("3") && B.equals("2")) {
			answer = "1";
		}
		System.out.println(answer);
	}
}