import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			if (H == 0 && W == 0) break;
			for (int i = 0; i < H; i++) {
				for(int k = 0; k < W; k++) {
					if(i == 0 || i == H-1) {
						System.out.print("#");
					}
					else if (i != 0 && (k != 0 && k != W-1)) {
						System.out.print(".");
					}
					else {
						System.out.print("#");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
