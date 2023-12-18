import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] height = new int[10];
		for(int i = 0; i<10;i++){
			height[i] = in.nextInt();
		}
		Arrays.sort(height);
		System.out.println(height[9]);
		System.out.println(height[8]);
		System.out.println(height[7]);
		in.close();
	}
}