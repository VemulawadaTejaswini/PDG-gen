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
		for (int i = 1; i<n ; i++ ) {
			for ( int j = 0; j<i ; j++ ) {
				max = Math.max(max,num[i]-num[j]);
			}
		}
		System.out.println(max);
	}
}