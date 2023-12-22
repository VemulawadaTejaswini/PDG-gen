import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int h[] = new int[300];
		int w[] = new int[300];
		int endIndex = 0;
		
		for (int i = 0; i < 300; i++) {
			h[i] = scan.nextInt();
			w[i] = scan.nextInt();

			if (h[i] == 0 && w[i] == 0) {
				endIndex = i;
				break;
			}
		}
		
		for (int i = 0; i < endIndex; i++) {
			for (int height = 0; height < h[i]; height++) {
				for (int width = 0; width < w[i]; width++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		scan.close();
	}
}