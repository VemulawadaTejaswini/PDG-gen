import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3000; i++) {
			String l = scanner.nextLine();
			String xy[] = l.split(" ");
			int xy_list[] = new int[2];
			for (int j = 0; j < xy.length; j++ ) {
				int int_xy = Integer.parseInt(xy[j]);
				xy_list[j] = int_xy;
			}

			if (xy_list[0] == 0 && xy_list[1] == 0) break;

			else if (xy_list[0] < xy_list[1]) {
				System.out.printf("%d %d\n", xy_list[0], xy_list[1]);
			}
			else {
				System.out.printf("%d %d\n", xy_list[1], xy_list[0]);
			}

		    //System.out.print(x);
		    //String trimmed = str.trim();


		}

	}
}
