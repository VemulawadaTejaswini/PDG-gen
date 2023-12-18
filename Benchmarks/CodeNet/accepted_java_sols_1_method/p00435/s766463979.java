import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] chara = {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
				"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", };
		String string = scan.next();
		int n = string.length();
		for (int i = 0; i < n; i++) {
			for (int j = 3; j < 29; j++) {
				if (string.subSequence(i, i+1).equals(chara[j])) {
					System.out.print(chara[j - 3]);
				}
			}
		}
		System.out.println();
	}

}