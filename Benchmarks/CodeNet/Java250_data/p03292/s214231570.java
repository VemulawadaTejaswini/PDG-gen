import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0;i < 3;i++) {
			num[i] = sc.nextInt();
		}
		int cost = 0;
		Arrays.sort(num);
		cost = num[1] - num[0];
		cost = num[2] - num[1] + cost;
		System.out.println(cost);
	}
}
