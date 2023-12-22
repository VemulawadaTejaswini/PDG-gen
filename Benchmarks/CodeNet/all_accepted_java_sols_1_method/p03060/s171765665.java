
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int max = 0;
		int[] value = new int[num];
		int[] cost = new int[num];
		
		for (int i = 0; i < num; i++) {
			value[i] = scan.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			cost[i] = scan.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if (value[i] > cost[i]) {
				max += value[i] - cost[i];
			}
		}
		
		System.out.println(max);
	}
}