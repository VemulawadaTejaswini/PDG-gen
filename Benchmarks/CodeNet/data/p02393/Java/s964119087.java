import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int[] sortNum = new int[3];
		sortNum[0] = num1;
		sortNum[1] = num2;
		sortNum[2] = num3;
		int count = 0;
		for (int i = 0; i < sortNum.length; i++) {
			if (sortNum[i] >= 1 && sortNum[i] <= 10000) {
			    count++;
			}
		}
		if (count == 3) {
			Arrays.sort(sortNum);
			for (int out : sortNum) {
				System.out.print(out + " ");
			}
		}
	}
}