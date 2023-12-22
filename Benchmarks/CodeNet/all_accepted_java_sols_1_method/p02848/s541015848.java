import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		N%=26;

		for(int i = 0;i < str.length;i++) {
			str[i] = (char)( (((int)str[i] + N) - 'A')%26 + 'A' );
		}
		for(int i = 0;i < str.length;i++) {
			System.out.print(str[i]);
		}
	}

}
