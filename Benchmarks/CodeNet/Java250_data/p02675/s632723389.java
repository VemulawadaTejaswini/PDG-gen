import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 13, 2020 1:21:16 PM
 */
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int statement = 0;
		statement = num%10;
		if (statement == 2 || statement == 4 || statement == 5 || statement == 7 || statement == 9) {
			System.out.print("hon");
		} else if (statement == 0 || statement == 1 || statement == 6 || statement == 8) {
			System.out.print("pon");
		} else if (statement == 3) {
			System.out.print("bon");
		}
	}
}
