import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		Arrays.sort(ary);
		System.out.println(ary[n / 2] - ary[n / 2 - 1]);
	}
}
