import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tree = scan.nextInt();
		int kazari = scan.nextInt();
		long[] height = new long[tree];

		for(int i=0;i<tree;i++) {
			height[i] = scan.nextLong();
		}
		Arrays.sort(height);

		long min = Long.MAX_VALUE;

		for(int i=0;i<tree-kazari+1;i++) {
			min = Math.min(min,height[i+kazari-1]-height[i]);
		}
		System.out.println(min);
		scan.close();

	}

}
