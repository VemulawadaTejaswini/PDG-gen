import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[] S = scan.next().toCharArray();
		boolean isGood = true;

		if(S[0] == S[1]) isGood = false;
		if(S[1] == S[2]) isGood = false;
		if(S[2] == S[3]) isGood = false;

		if(isGood) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}

	}
}