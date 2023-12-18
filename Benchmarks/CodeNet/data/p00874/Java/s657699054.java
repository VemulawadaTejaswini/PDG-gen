import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int w = stdIn.nextInt();
			int d = stdIn.nextInt();
			if(w == 0 && d == 0) break;
			int[] wh = new int[w];
			int[] dh = new int[d];
			for(int i = 0; i < w; i++) {
				wh[i] = stdIn.nextInt();
			}
			for(int i = 0; i < d; i++) {
				dh[i] = stdIn.nextInt();
			}
			int count = 0;
			if(w >= d) {
				for(int i = 0; i < w; i++) {
					for(int j = 0; j < d; j++) {
						if(wh[i] == dh[j]) {
							count += wh[i];
							wh[i] = 0;
							dh[j] = 0;
						}
					}
				}
			}
			else {
				for(int i = 0; i < d; i++) {
					for(int j = 0; j < w; j++) {
						if(dh[i] == wh[j]) {
							count += dh[i];
							wh[j] = 0;
							dh[i] = 0;
						}
					}
				}
			}
			for(int i = 0; i < w; i++) {
				count += wh[i];
			}
			for(int i = 0; i < d; i++) {
				count += dh[i];
			}
			System.out.println(count);
		}
	}
}
	