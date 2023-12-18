
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] list = new int[n][2];
		for (int i = 0; i < list.length; i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
		}
		
		double sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum += Math.sqrt(Math.pow((list[i][0] - list[j][0]), 2) + Math.pow((list[i][1] - list[j][1]), 2));
			}
		}
		
		System.out.println(sum / n * 2);
		
	}
}