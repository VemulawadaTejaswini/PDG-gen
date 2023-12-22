import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int h = in.nextInt();
		int w = in.nextInt();
		int[][] m = new int[H][W]; 
		System.out.println((H - h) * (W - w));
	}

}
