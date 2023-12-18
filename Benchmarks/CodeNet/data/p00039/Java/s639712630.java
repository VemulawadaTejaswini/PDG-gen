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
			String tmp = stdIn.next();
			solv(tmp);
		}
	}
	public static void solv(String a) {
		int tmp = 0;
		tmp += check(a.charAt(0));
		for(int i = 1; i < a.length(); i++) {
			if(check(a.charAt(i)) <= check(a.charAt(i-1))) {
				tmp += check(a.charAt(i));
			}
			else {
				tmp -= check(a.charAt(i));
			}
		}
		System.out.println(Math.abs(tmp));
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