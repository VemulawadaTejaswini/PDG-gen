import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String moji = stdIn.next();
		stdIn.close();
		
		for (int i = (moji.length() - 1); i >= 0; i--) {
			System.out.print(moji.charAt(i));
		}
		System.out.println();
}
}