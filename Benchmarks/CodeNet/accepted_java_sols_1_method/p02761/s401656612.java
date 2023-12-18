import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Just use Brute Force
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int[][] query = new int[M][2];
		for (int i = 0; i < M; i++) {
			query[i][0] = input.nextInt();
			query[i][1] = input.nextInt();
		}
		int lo = 1;
		while (N>1) {
			lo*=10;
			N--;
		}
		int hi = lo*10;
		if (lo==1) lo--;
		int ans = Integer.MAX_VALUE;
		for (int curNum = lo; curNum < hi; curNum++) {
			boolean bad = false;
			String Num = Integer.toString(curNum);
			for (int i = 0; i < M; i++) {
				int index = query[i][0]-1;
				int digit = query[i][1];
				if (!Num.substring(index,index+1).equals(Integer.toString(digit))) {
					bad = true;
					break;
				}
			}
			if (!bad) {
				ans = curNum;
				break;
			}
		}
		if (ans==Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(ans);
	}
}