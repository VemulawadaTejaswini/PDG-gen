import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		for (int i = 0; i<n ; i++ ) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int max = num[1] - num[0];
		int min = num[0];
		for (int i = 1; i<n  ; i++) {
			min = Math.min(min,num[i-1]);
			max = Math.max(max,num[i]-min);
		}
		System.out.println(max);
	}
}