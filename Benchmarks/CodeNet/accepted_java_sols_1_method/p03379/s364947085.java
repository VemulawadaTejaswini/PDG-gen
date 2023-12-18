import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] x2 = new int[n];

		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
			x2[i] = x[i];
		}
		Arrays.sort(x2);

		int left = x2[x2.length/2-1];
		int right =x2[x2.length/2];



		for(int i=0;i<x.length;i++) {
			if(x[i] <= left) {
				System.out.println(right);
			} else {
				System.out.println(left);
			}

		}

	}

}