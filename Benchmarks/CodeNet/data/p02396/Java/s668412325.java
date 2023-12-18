import java.util.Scanner;
import java.util.Arrays;

class PrintTestCases {
	private static final int ARRAY_MAX = 10000;
	private int[] data = new int[ARRAY_MAX];
	/**
	 * 
	 */
	private static int CNT_NUM = 1;
	
	public PrintTestCases() {
		Arrays.fill(data, 0);
	}
	
	private void read() {
		final int FINISH_NUMBER = 0;
		for (int i = 0; i < ARRAY_MAX; i++) {
			Scanner scan = new Scanner(System.in);
			int addNum = scan.nextInt();
			if (FINISH_NUMBER >= addNum) {
				break;
			}
			data[i] = addNum;
		}
	}
	
	private String toString(int val) {
		return "Case " + (CNT_NUM++) + ":" + val;
	}
	
	public void run() {
		read();
		
		for (int i = 0; i < ARRAY_MAX; i++) {
			if (0 >= data[i]) {
				break;
			}
			System.out.println(toString(data[i]));
		}
	}
}
public class Main {

	public static void main(String[] args) {

		new PrintTestCases().run();
	}

}

