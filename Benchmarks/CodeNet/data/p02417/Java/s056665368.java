import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int [] count = new int[26];
		int i = 0, alphabet_AtoZ = 0;
		String input;
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextLine()) {
				input = sc.nextLine();
				for(i = 0; i < input.length(); i++) {
					alphabet_AtoZ = Character.getNumericValue(input.charAt(i)) - 10;
					if(0 <= alphabet_AtoZ && alphabet_AtoZ <= 25) {
						count[alphabet_AtoZ]++;
					}
				}
			}
			for(i = 0; i < 26; i++) {
				System.out.println((char)(i + 97) + " : " + count[i]);
			}
		}
	}
}
