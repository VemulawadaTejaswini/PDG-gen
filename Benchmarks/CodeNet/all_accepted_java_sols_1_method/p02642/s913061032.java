import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String[] input;
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[1000001];
		input = reader.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arr[Integer.parseInt(input[i])]++;
		}
		boolean[] divisible = new boolean[1000001];
		int ans = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > 0 && !divisible[i]) {
				for(int j = i * 2; j < arr.length; j += i) {
					divisible[j] = true;
				}
				if(arr[i] > 1) {
					divisible[i] = true;
				}
			}
			if(!divisible[i]) {
				ans += arr[i];
			}
		}
		out.print(ans);
		out.flush();
		out.close();
	}

}
