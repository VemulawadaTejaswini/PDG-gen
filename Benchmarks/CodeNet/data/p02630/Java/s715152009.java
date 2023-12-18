import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] cnts = new long[100001];
		long cursum = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			cnts[x]++;
			cursum+=x;
		}
		int Q = input.nextInt();
		for (int i = 0; i < Q; i++) {
			int B = input.nextInt();
			int C = input.nextInt();
			cnts[C]+=cnts[B];
			long diff = C-B;
			cursum+=diff*cnts[B];
			cnts[B]=0;
			System.out.println(cursum);
		}
	}
}
