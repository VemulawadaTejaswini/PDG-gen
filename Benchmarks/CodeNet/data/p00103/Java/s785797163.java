import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	public static void main (String[] args) throws java.lang.Exception {
		int inning = Integer.parseInt(br.readLine());
		solve(inning);
	}

	public static void solve(int maxInning) throws IOException{
		int runner = 0;
		int inning = 0;
		int out = 0;
		int[] score = new int[2];
		score[0] = 0;
		score[1] = 0;
		
		while(inning < maxInning) {
			String str = br.readLine();
			if (str.equals("HIT")) {
				if (runner == 3) score[inning%2]++;
				else runner++;
			} else if (str.equals("HOMERUN")) {
				score[inning%2] += (runner+1);
				runner = 0;
			} else if (str.equals("OUT")) {
				if (out == 2) {
					runner = 0;
					inning ++;
					out = 0;
				} else {
					out++;
				}
			}
		}
		System.out.println(score[0]);
		System.out.println(score[1]);
	}
}