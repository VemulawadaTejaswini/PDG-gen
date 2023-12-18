
import java.util.Scanner;
import java.math.*;

public class Main {

	/*
	 * 余りの最大値を求める。
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int stan_height = s.nextInt();

		int sum = 0;
		int height = 0;
		for(int i = 0; i < number; i++) {
			height = s.nextInt();
			if(height >= stan_height) {
				sum++;
			}
		}
		
		System.out.println(sum);
	}

}
