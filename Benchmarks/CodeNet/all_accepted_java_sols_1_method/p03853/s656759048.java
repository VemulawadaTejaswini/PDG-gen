import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int HEIGHT = scan.nextInt();
		final int WIDTH = scan.nextInt();
		char[][] pic = new char[HEIGHT][WIDTH];
		for(int i = 0; i < HEIGHT; i++){
			pic[i] = scan.next().toCharArray();
		}

		// answer
		for(int i = 0; i < HEIGHT; i++){
			for(int j = 0; j < WIDTH; j++){
				System.out.print(pic[i][j]);
			}
			System.out.println("");
			for(int j = 0; j < WIDTH; j++){
				System.out.print(pic[i][j]);
			}
			System.out.println("");
		}

	}
}
