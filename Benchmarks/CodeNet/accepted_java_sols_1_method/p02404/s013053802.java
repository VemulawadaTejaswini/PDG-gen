import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i == 0) {
			String line = sc.nextLine();
			String[] x = line.split(" ");
			int H = Integer.parseInt(x[0]);
			int W = Integer.parseInt(x[1]);
			if (H == 0 && W == 0) {
				break;
			}
			String nakami = "";
			String jouge = "##";
			int j = 0;
			while (j < W - 2) {
				nakami += ".";
				jouge += "#";
				j++;
			}
			String yoko = "#" + nakami + "#";
			int k = 0;
			while (k < H) {
				if (k == 0 || k == H - 1) {
					System.out.println(jouge);
				} else {
					System.out.println(yoko);
				}
				k++;
			}
			System.out.println("");

		}
	}

}