import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arg = scanner.nextInt();
		scanner.close();
		
		System.out.println((int)Math.pow(arg, 3));
	}

}