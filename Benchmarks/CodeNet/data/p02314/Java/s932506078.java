import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int sum = Integer.parseInt(line[0]);
		int coinC = Integer.parseInt(line[1]);
		line = s.nextLine().split(" ");
		int[] input = new int[coinC];
		for(int i=0 ; i<coinC ; i++) {
			input[i] = Integer.parseInt(line[i]);
		}
		System.out.println(solve(sum, input));
	}

	public static int solve(int sum, int[] input) {
		int[][] result = new int[sum+1][input.length+1];
		for(int j=1 ; j<=sum ; j++)
			result[j][0] = Integer.MAX_VALUE;
		for(int i=1 ; i<=input.length ; i++) {
			for(int j=1 ; j<=sum ; j++) {
				if(j/input[i-1] == 0) {
					result[j][i] = result[j][i-1];
				}else {
					result[j][i] = Math.min(result[j][i-1], result[j-input[i-1]][i] + 1);
				}
			}
		}
		return result[sum][input.length];
	}
}