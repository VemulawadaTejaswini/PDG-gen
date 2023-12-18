import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int tyouCount = 0;
		int hishiCount = 0;

		while (sc.hasNext()) {
			String[] inputData = sc.next().split(",");

			int[] list = new int[3];

			list[0] = Integer.parseInt(inputData[0]);
			list[1] = Integer.parseInt(inputData[1]);
			list[2] = Integer.parseInt(inputData[2]);

			Arrays.sort(list);

			if (list[2] * list[2] == list[0] * list[0] + list[1] + list[1]) {
				tyouCount += 1;
			} else if (list[0] == list[1]) {
				hishiCount += 1;
			}
		}
		System.out.println(tyouCount);
		System.out.print(hishiCount);
	}
}