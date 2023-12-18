import java.util.Arrays;
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
		int[] ary = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < ary.length; i++) {
			ary[i] = scanner.nextInt();
		}
		scanner.close();
		
		Arrays.sort(ary);
		
		for (int i = 0; i < ary.length - 1; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println(ary[ary.length - 1]);
	}

}