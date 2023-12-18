import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		int[] intList = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int count = 0; count < 10; count++) {
			int temp = sc.nextInt();
			if (temp <= 10000) {
				intList[count] = temp;
			}
		}
		Arrays.sort(intList);
		for (int j = 9; j >= 7; j--) {
			System.out.println(intList[j]);
		}
		sc.close();
	}
}