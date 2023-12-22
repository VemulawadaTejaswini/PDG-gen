import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		sc.close();

		int sa = (int)'A' - (int)'a';

		for(char moji : input.toCharArray()) {
			if('a' <= moji && moji <= 'z') {
				System.out.print( (char)((int)moji + sa) );
			} else if('A' <= moji && moji <= 'Z') {
				System.out.print( (char)((int)moji - sa) );
			} else {
				System.out.print(moji);
			}
		}
		System.out.println();
	}
}