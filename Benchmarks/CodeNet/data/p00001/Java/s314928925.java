import java.util.Arrays;
import java.util.Scanner;


class Main {
	final static int SIZE = 10;
	final static int OUT = 3;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] heights = new int[SIZE];
		
		for(int i = 0; i < SIZE; i++){
			heights[i] = in.nextInt();
		}
		
		Arrays.sort(heights);
		
		for(int i = 0; i < OUT; i++){
			System.out.println("" + heights[SIZE - 1 - i]);
		}
	}

}