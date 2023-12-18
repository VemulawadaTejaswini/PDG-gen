import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		String s = new Scanner(System.in).next();
		final int REKI = 2019;
		int[][] ans = new int[2][REKI];

		int a = 0;
		for(int i = 0 ; i < s.length() ; i++ ) {
			int temp =Character.getNumericValue(s.charAt(i));;
			for(int j = 0 ; j < REKI ; j++ ) {
				ans[1][(j*10+temp) %REKI] += ans[0][j];
			}
			a+= ans[1][0];
			ans[1][temp] +=1;
			ans[0] = ans[1].clone();
			Arrays.fill(ans[1], 0);
		}

		System.out.println(a);
	}

}