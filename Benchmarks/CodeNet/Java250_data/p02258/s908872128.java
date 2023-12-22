import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		int max = Integer.MIN_VALUE;
		Scanner san = new Scanner(System.in);
		int listCount = san.nextInt();
		int[] list = new int[listCount];
		for(int i = 0; i < listCount; i++){
			list[i] = san.nextInt();
		}
		int min = list[0];
		for(int i = 1; i < listCount; i++){
			max = Math.max(max, list[i] - min);
			min = Math.min(min, list[i]);
		}
		System.out.println(max);
	}
}