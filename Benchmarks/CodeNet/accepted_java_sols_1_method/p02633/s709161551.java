import java.io.*;
import java.math.*;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = 1;
		for (int i = 1; i <= T; i++) {
			int X = input.nextInt();
			int cur = X;
			int ans = 1;
			while (cur%360!=0) {
				cur+=X;
				cur%=360;
				ans++;
			}
			System.out.println(ans);
		}
	}
}