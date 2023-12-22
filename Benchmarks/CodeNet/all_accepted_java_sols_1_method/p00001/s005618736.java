import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] heights = new int[10];
		for(int i = 0; i < 10; i++){
			heights[i] = scan.nextInt();
		}

		Arrays.sort(heights);
		for(int i = 9; i >= 7; i--){
			System.out.println(heights[i]);
		}
	}
}