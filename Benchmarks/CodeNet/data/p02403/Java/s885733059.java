import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H==0&&W==0) {break;}
			for (int i=0; i<H; i++) {
				for (int j=0; j<W; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

