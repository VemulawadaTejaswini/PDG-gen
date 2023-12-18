import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		if(S.equals("a") || S.equals("i") || S.equals("u") || S.equals("e") || S.equals("o")) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}
}
