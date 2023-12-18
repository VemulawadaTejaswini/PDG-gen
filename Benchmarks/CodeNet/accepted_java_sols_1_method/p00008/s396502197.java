import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		final int N = 9;
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			int n = in.nextInt();
			int ans = 0;
			for(int a=0;a<=N;a++) {
				for(int b=0;b<=N;b++) {
					for(int c=0;c<=N;c++) {
						for(int d=0;d<=N;d++) {
							if(a+b+c+d == n) ans++;
						}
					}
				}
			}
			System.out.printf("%d\n", ans);
		}
	}
}