import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int Q = input.nextInt();
		String S = input.next();
		int[] AC = new int[N]; //# of AC substrings up to ith index
		for (int i = 1; i < N; i++) {
			AC[i] = AC[i-1];
			if (S.charAt(i)=='C'&&S.charAt(i-1)=='A') AC[i]++;
		}
		//System.out.println(AC[N-1]);
		for (int i = 0; i < Q; i++) {
			int L = input.nextInt();
			int R = input.nextInt();
			System.out.println(AC[R-1]-AC[L-1]);
		}
	}
}