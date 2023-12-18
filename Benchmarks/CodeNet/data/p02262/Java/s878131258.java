
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int flag = 0;
		int[] numList = new int[count];

		for (int i = 0; i < count; i++) {
			numList[i] = scanner.nextInt();
		}
		Tool.shellSort(numList, count, flag);

		for (int i = 0; i < count; i++) {
			System.out.println(numList[i]);
		}
	}
}

class Tool {

	static void inssertionSort(int[] numList, int count, int distance, int flag) {

		for (int i = distance; i < count; i++) {
			int temp = numList[i];
			int j = i - distance;
			while (j >= 0 && numList[j] > temp) {
				numList[j + distance] = numList[j];
				j = j - distance;
				flag++;
			}
			numList[j + distance] = temp;
		}

	}

	static void shellSort(int[] numList, int count, int flag) {

		int m = count / 2;
		int[] distanceList = new int[count / 2];
		for (int i = 0; i < m; i++) {
			distanceList[i] = m - i;
		}
		for (int i = 0; i < distanceList.length; i++) {
			inssertionSort(numList, count, distanceList[i], flag);
		}
		System.out.println(m);
		System.out.print(distanceList[0]);
		for (int i = 1; i < distanceList.length; i++) {
			System.out.print(" " + distanceList[i]);
		}
		System.out.println();
	}
}