import java.util.Scanner;

public Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print((i + j) % 2 == 0 ? "#" : ".");
			}
			System.out.println();
		}
	}
}