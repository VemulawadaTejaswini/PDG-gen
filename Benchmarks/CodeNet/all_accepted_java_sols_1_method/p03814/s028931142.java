import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int atA = 0;
		int atZ = 0;

		for (int i = 0; i < S.length(); i++) {
			if(String.valueOf(S.charAt(i)).equals("A")) {
				atA = i;
				for (int j = i + 1; j < S.length(); j++) {
					if(String.valueOf(S.charAt(j)).equals("Z")) {
						atZ = j;
					}
				}
				break;
			}
		}
		System.out.println(atZ - atA + 1);
	}
}
