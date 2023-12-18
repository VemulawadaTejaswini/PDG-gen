import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> w = new ArrayList<Integer>();
		int H, W;
		int count;
		for (count = 0; true; count++) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			h.add(H);
			w.add(W);
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < h.get(i); j++) {
				for (int k = 0; k < w.get(i); k++) {
					if (j == 0 || j + 1 == h.get(i)) {
						System.out.print("#");
					} else if (k == 0 || k + 1 == w.get(i)) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}
