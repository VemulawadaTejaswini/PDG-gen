import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=0, w=0;
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0){
				break;
			}
			for (h = 0; h < H; h++) {
				for (w = 0; w < W; w++) {
					if (h % 2 == 0){
						if (w % 2 == 0){
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					} else {
						if (w % 2 == 0){
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}

}