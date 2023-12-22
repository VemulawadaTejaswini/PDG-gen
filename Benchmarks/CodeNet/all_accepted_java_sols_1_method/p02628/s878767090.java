import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}
		
		Arrays.sort(list);
		int total = 0;
		for(int i = 0; i<k; i++) {
			total += list[i];
		}
		System.out.print(total);
	}

}
