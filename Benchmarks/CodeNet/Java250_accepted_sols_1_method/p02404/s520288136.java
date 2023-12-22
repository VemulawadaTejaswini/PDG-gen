import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\????????????
		Scanner sc = new Scanner(System.in);

		// ?????°?????????
		int cnt1 = 0;
		int cnt2 = 0;

		while(true) {

			int H = sc.nextInt();
			int W = sc.nextInt();

			if(H == 0 && W == 0)
				break;

			for(cnt1 = 0; cnt1 < W; cnt1++ ) {

				System.out.print("#");

			}

			System.out.println("");

			for(cnt2 = 0; cnt2 < H-2; cnt2++) {

				System.out.print("#");

				for(cnt1 = 0; cnt1 < W-2; cnt1++ ) {

					System.out.print(".");

				}

				System.out.println("#");

			}

			for(cnt1 = 0; cnt1 < W; cnt1++ ) {

				System.out.print("#");

			}
			System.out.println("");
			System.out.println("");
		}
		sc.close();}
}