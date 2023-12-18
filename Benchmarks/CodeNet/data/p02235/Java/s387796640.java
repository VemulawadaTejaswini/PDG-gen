import java.util.Scanner;

public class Main{
	
	public static int max(int x, int y) {
		if(x > y)
			return x;
		else return y;
	}
	
	public static int longest(String x, String y) {
		int[][] results = new int[x.length()+1][y.length()+1];
		int max = 0;
		for(int i = 0; i <= x.length(); i++) {
			for(int j = 0; j <= y.length(); j++) {
				if(i == 0 || j == 0)
					results[i][j] = 0;
				else if(x.charAt(i-1) == y.charAt(j-1))
					results[i][j] = results[i-1][j-1] + 1;
				else results[i][j] = max(results[i-1][j], results[i][j-1]);
				if(results[i][j] > max)
					max = results[i][j];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		for(int i = 0; i < limit; i++) {
			System.out.println(longest(in.next(), in.next()));
		}
		in.close();
	}

}

