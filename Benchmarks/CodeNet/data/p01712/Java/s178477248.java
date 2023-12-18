import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		
		int[] listx = new int[W+1];
		int[] listy = new int[H+1];
		
		for(int i = 0; i < N; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			int w = stdIn.nextInt();
			listx[Math.max(0, x-w)]++;
			if(x + w <= W)  {
				listx[x+w]--;
			}
			
			listy[Math.max(0, y-w)]++;
			if(y + w <= H) {
				listy[y+w]--;
			}
		}
		boolean ans1 = true;
		boolean ans2 = true;
		for(int i = 1; i < W+1; i++) {
			listx[i] += listx[i-1];
			if(listx[i] == 0) {
				ans1 = false;
			}
		}
		for(int i = 1; i < H+1; i++) {
			listy[i] += listy[i-1];
			if(listy[i] == 0 || ans1) {
				ans2 = false;
			}
		}
		System.out.println((ans1||ans2)?"Yes":"No");
		
		
	}
}