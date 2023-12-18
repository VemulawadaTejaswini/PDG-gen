import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int[] input = new int[cnt];
		for(int i=0 ; i<cnt ; i++) {
			input[i] = Integer.parseInt(s.nextLine());
		}
		System.out.println(solve(input));
	}

	public static int solve(int[] input) {
		int[] result = new int[input.length];
		Arrays.fill(result, 1);
		for(int i=0 ; i<input.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(input[j]<input[i]) {
					result[i] = Math.max(result[i], result[j]+1);
				}
			}
		}
		int returnV = 0;
		for(int i=0 ; i<result.length ; i++) {
			returnV = Math.max(returnV, result[i]);
		}
		return returnV;
	}
}