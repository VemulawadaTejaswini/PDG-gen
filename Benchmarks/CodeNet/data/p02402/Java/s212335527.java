import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int MIN = 1000001, MAX = -1000001; long SUM = 0;
		for(int i = 0; i < N; ++i) {
			int a = sc.nextInt();
			MIN = Math.min(MIN, a);
			MAX = Math.max(MAX, a);
			SUM += a;
		}
		System.out.println(MIN + " " + MAX + " " + SUM);
	}
}
