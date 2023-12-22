import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		for(int i=0; i<S.length()-1; i++) {
			if(S.charAt(i)==S.charAt(i+1)) {
				System.out.println("Bad");
				return;
			}
		}
		System.out.println("Good");
	}
}
