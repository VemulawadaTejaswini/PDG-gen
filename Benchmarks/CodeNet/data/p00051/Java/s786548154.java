import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			char[] A = stdIn.next().toCharArray();
			Integer[] AA = p(A);
			char[] B = Arrays.copyOf(A, A.length);
			Integer[] BB = p(B);
			Arrays.sort(AA);
			Arrays.sort(BB, Collections.reverseOrder());
			int a = pa(AA);
			int b = pa(BB);
			System.out.println(b - a);
		}
	}
	public static Integer[] p(char[] a) {
		Integer[] ret = new Integer[a.length];
		for(int i = 0; i < a.length; i++) {
			ret[i] = Integer.parseInt(String.valueOf(a[i]));
		}
		return ret;
	}
	public static int pa(Integer[] a) {
		int ret = 0;
		for(int i = 0; i < a.length; i++) {
			ret += a[i] * pb(8 - i);
		}
		return ret;
	}
	public static int pb(int a) {
		int ax = 1;
		for(int i = 1; i < a; i++) {
			ax *= 10;
		}
		return ax;
	}
}