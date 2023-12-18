
import java.util.*;

public class Main {

	public static int getLength(String x, String y) {
		int ans = 0;
		int[][] answer = new int[x.length() + 1][y.length() + 1];
		for(int i = 1; i <= x.length(); i++) {
			for(int j =1 ; j <=y.length(); j++) {
				if(x.charAt(i-1) != y.charAt(j-1)) {
					answer[i][j] = max(answer[i-1][j],answer[i][j-1]);
				}
				if(x.charAt(i-1) == y.charAt(j-1)) {
					answer[i][j] = 1 + answer[i-1][j-1];
				}
			}//ends inner for 
		}//ends outer for
		ans = answer[x.length()][y.length()];
		return ans;
	}
	
	public static int max(int a , int b) {
		if(a >= b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pairs = in.nextInt();
		for(int i = 0; i < pairs; i++) {
			String first = in.next();
			String second = in.next();
			System.out.println(getLength(first, second));
		}
		in.close();
	}
}
