import java.util.Scanner;

public class Main {

	private static String halfSpace = " ";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String strNumOfMountain = scanner.nextLine();

		int numOfMountain = Integer.parseInt(strNumOfMountain);

		String tmp = scanner.nextLine();

		scanner.close();

		String[] strTmp = tmp.split(halfSpace);

		int[] heights = new int[numOfMountain];

		for(int i = 0; i < numOfMountain; i++) {
			heights[i] = Integer.parseInt(strTmp[i]);
		}

		int max = heights[0];
		int NumOfCanSeeOcean = 1;

		for(int i = 1; i < numOfMountain; i++) {
			if(max <= heights[i]) {
				max = heights[i];
				NumOfCanSeeOcean++;
			}
		}

		System.out.println(NumOfCanSeeOcean);

	}

}