import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numStones = sc.nextInt();
		int k = sc.nextInt();
		int[] stoneHeights = new int[numStones];
		
		for(int i = 0; i < numStones; i++) {
			stoneHeights[i] = sc.nextInt();
		}
		
		int[] minCostForStones = new int[numStones];
		Arrays.fill(minCostForStones, Integer.MAX_VALUE);
		minCostForStones[0] = 0;
 		for(int i = 0; i < numStones; i++) {
			for(int j = 1; j <= k; j++) {
				if((i + j) < numStones) {
					minCostForStones[i + j] = Math.min(minCostForStones[i + j], minCostForStones[i] + Math.abs(stoneHeights[i + j] - stoneHeights[i]));
				}
			}
		}
		System.out.println(minCostForStones[numStones - 1]);
	}
}