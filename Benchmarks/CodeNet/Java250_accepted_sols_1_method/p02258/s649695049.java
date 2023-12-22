import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = stdIn.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int pre = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(pre <= list[i]) continue;
			else pre = list[i];
			for(int j = i+1; j < n; j++) {
				if(list[j] - list[i] > max) {
					max = list[j] - list[i];
				}
			}
		}
		System.out.println(max);
	}
}