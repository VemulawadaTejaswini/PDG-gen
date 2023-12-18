import java.util.Scanner;

public class Main {
	static int h, w;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		input();
		while (h != 0 && w != 0){
			drawLine();
			input();
		}

	}
	static void drawLine () {
		String oddLine = makeOddLine(w);
		String evenLine = makeEvenLine(w);
		for (int i = 0; i < h; i++){
			if (i % 2 == 0) System.out.println(oddLine);
			else
				System.out.println(evenLine);
		}
		System.out.println();
	}
	static void input (){
		h = sc.nextInt();
		w = sc.nextInt();
	}

	static String makeOddLine(int n) {
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				line.append("#");
			} else {
				line.append(".");
			}
		}
		return line.toString();
	}

	static String makeEvenLine(int n) {
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				line.append(".");
			} else {
				line.append("#");
			}
		}
		return line.toString();
	}

}