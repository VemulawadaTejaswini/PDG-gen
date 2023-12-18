import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc066.contest.atcoder.jp/tasks/abc066_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i=0; i<3; i++) a[i] = sc.nextInt();
		sc.close();
		
		Arrays.sort(a);
		System.out.println(a[0]+a[1]);

	}

}
