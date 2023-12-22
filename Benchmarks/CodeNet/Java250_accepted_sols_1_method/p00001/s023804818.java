import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[10];
		for(int i=0;i<10;i++) {
			height[i] = sc.nextInt();
		}
		Arrays.sort(height);
		for(int i=0;i<3;i++) {
			System.out.println(height[9-i]);
		}
	}

}