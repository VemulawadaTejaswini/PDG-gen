import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private int height[];

	private void mainrun() {
		scan = new Scanner(System.in);

		height = new int[10];

		for(int i = 0;i < 10;i++) {
			height[i] = scan.nextInt();
		}

		Arrays.sort(height);;

		for(int i = 0;i < 3;i++) {
			System.out.println(height[height.length - i - 1]);
		}

		scan.close();

	}
}
