import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		String S = kbs.next();
		String string = "";
		for(int i = 0; i < S.length(); i++) {
			string += "x";
		}
		System.out.printf("%s", string);
		kbs.close();
	}

}
