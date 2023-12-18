import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\????????????
		Scanner sc = new Scanner(System.in);

		// ?????°?????????
		int H = sc.nextInt();
		int W = sc.nextInt();
		int cnt1 = 0;
		int cnt2 = 0;

		while(cnt1 < H) {

			if(H == 0 && W == 0)
				break;

			cnt1++;

			for(cnt2 = 0; cnt2 <W ; cnt2++ ) {
				System.out.print("#");
			}
			System.out.println("\n");
		}

		sc.close();

	}

}