import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int h,w;

		Scanner stdIn = new Scanner(System.in);

		h = stdIn.nextInt();
		w = stdIn.nextInt();

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print('#');
			}
			System.out.println();
		}

	}

}