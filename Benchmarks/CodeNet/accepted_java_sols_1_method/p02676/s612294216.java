import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 13, 2020 1:21:16 PM
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String string = in.next();
		StringBuilder mBuilder = new StringBuilder();
		if (string.length()>num) {
			mBuilder.append(string.substring(0, num)).append("...");
			System.out.println(mBuilder.toString());
		}else {
			System.out.println(string);
		}
	}
}
