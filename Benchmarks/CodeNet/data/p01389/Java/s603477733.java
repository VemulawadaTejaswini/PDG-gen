import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int height = Integer.parseInt(line[0]);
		int width = Integer.parseInt(line[1]);
		int [][] input = new int[width+1][height+1];
		for(int i=1 ; i<=height ; i++) {
			String str = s.nextLine();
			for(int j=1 ; j<=width ; j++) {
				input[j][i] = Integer.parseInt(str.substring(j-1, j));
			}
		}
		System.out.println(solve(height, width, input));
	}

	public static int solve(int height, int width, int[][] input) {
		int[][] result = new int[width+1][height+1];
		for(int i=0 ; i<=width ; i++) {
			result[i][0] = Integer.MAX_VALUE;
		}
		for(int i=0 ; i<=height ; i++) {
			result[0][i] = Integer.MAX_VALUE;
		}
		result[0][1] = 0;
		result[1][0] = 0;

		for(int i=1 ; i<=width ; i++) {
			for(int j=1 ; j<=height ; j++) {
				if(result[i-1][j] >= result[i][j-1])
					result[i][j] = result[i][j-1] + input[i][j];
				else
					result[i][j] = result[i-1][j] + input[i][j];
			}
		}
		return result[width][height];
	}
}