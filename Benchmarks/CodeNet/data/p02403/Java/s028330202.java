import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int H =0;
		int W =0;

		do {
			H = scane.nextInt();

			W= scane.nextInt();

			for(int i =0; i<H; i++){
				for (int j = 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println(""+"\n");
			}



		} while ((H+W) != 0);
	}
}