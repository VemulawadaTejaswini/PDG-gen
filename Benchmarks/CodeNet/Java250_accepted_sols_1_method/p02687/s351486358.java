import java.util.Scanner;

/**
 * @author hellb
 *
 */
public class Main {

	private static String ARC = "ARC";

	private static String ABC = "ABC";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sNum1 = scan.next();
        String sResult;
        scan.close();

        if (ARC.equals(sNum1)) {
        	sResult = ABC;
        } else {
        	sResult = ARC;
        }
        System.out.print(sResult);
	}
}
