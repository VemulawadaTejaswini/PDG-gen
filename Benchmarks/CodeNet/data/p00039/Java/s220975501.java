import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static long[] list = new long[10001];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			char[] tmp = stdIn.next().toCharArray();
			solv(tmp);
		}
	}
	public static void solv(char[] a) {
		int tmp = 0;
		tmp += check(a[0]);
		for(int i = 1; i < a.length; i++) {
			int ax = check(a[i]);
			int bx = check(a[i-1]);
			if(ax <= bx) {
				tmp += ax;
			}
			else {
				tmp -= bx;
				tmp += ax - bx;
			}
		}
		System.out.println(tmp);
	}
	public static int check(char a) {
		if(a == 'M') return 1000;
		if(a == 'D') return 500;
		if(a == 'C') return 100;
		if(a == 'L') return 50;
		if(a == 'X') return 10;
		if(a == 'V') return 5;
		if(a == 'I') return 1;
		return 0;
	}
}