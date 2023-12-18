import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner("in1.txt");
		int arg = scanner.nextInt();
		scanner.close();
		
		PrintWriter printWriter = new PrintWriter("out1.txt");
		printWriter.println((int)Math.pow(arg, 3));
		printWriter.close();
	}

}