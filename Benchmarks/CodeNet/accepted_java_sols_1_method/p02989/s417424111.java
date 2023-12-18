import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(array);

		System.out.println(array[n/2]-array[n/2-1]);
	}
}