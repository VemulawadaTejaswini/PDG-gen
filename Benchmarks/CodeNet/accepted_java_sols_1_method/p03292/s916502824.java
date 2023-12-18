import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] taskArr = new int[3];
		for (int i = 0; i < taskArr.length; i++) {
			taskArr[i] = sc.nextInt();
		}
		Arrays.sort(taskArr);
		int cost = 0;
		for (int i = 1; i < taskArr.length; i++) {
			cost += taskArr[i] - taskArr[i - 1];
		}
        System.out.println(cost);
	}
}