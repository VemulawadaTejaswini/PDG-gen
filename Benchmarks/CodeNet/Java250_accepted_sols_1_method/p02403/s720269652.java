import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			if (H >= 1 && H <= 300 && W >= 1 && W <= 300) {
				rows.add(H);
				columns.add(W);
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			for (int i = 0; i < rows.size(); i++) {
				for (int j = 0; j < rows.get(i); j++) {
					for (int k = 0; k < columns.get(i); k++) {

						System.out.print("#");
					}

					System.out.println();
				}

				System.out.println();
			}
		}

	}

}