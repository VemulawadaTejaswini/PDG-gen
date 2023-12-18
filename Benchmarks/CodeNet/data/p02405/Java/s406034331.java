import java.util.Scanner;

public class Ex03PrintAChessboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H;
		int W;
		int count;
		int[] detaH = new int[300];
		int[] detaW = new int[300];
		for (count = 0; true; count++) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			detaH[count] = H;
			detaW[count] = W;
		}
		for (int i = 0; i < count; i++) {
			for (int i2 = 0; i2 < detaH[i]; i2++) {
				if ((i2 + 2) % 2 == 0) {
					for (int i3 = 0; i3 < detaW[i]; i3++) {
						if ((i3 + 2) % 2 == 0) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
					System.out.print("\n");
				} else {
					for (int i3 = 0; i3 < detaW[i]; i3++) {
						if ((i3 + 2) % 2 != 0) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
					System.out.print("\n");
				}
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
