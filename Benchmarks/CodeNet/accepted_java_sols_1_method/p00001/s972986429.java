import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int[] height = new int[10];
			for (int i = 0; i < 10; i++) {
					height[i] = scan.nextInt();
			}
			Arrays.sort(height);
			
			for(int i=9;i>6;i--){
				System.out.println(height[i]);
			}
		}
}