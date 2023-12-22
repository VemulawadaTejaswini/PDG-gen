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
		int maxAns = Integer.MIN_VALUE;
		
		list[0] = stdIn.nextInt();
		int min = list[0];
		int max = -2000000000;
		for(int i = 1; i < n; i++) {
			list[i] = stdIn.nextInt();
			max = list[i];
			if(maxAns < max - min) {
				maxAns = max - min;
			}
			if(min > list[i]) {
				min = list[i];
			}
			
			
		}
		
		
		System.out.println(maxAns);
	}
}