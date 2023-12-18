import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		int W = input.nextInt();
		int H = input.nextInt();
		int N = input.nextInt();
		int ans = W*H; //Whole area is white initially
		int xCovL = 0;
		int yCovL = 0;
		int xCovR = 0; //Variables that define the range of the black area
		int yCovR = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			int a = input.nextInt();
			if (a==1) {
				xCovL = Math.max(xCovL, x);
			}else if (a==2) {
				xCovR = Math.max(xCovR, W-x); //Converting tricky area to simpler number to work with
			}else if (a==3) {
				yCovL = Math.max(yCovL, y);
			}else if (a==4) {
				yCovR = Math.max(yCovR, H-y);
			}
		}
		ans-=xCovL*H;
		ans-=xCovR*H;
		int xDiff = W-xCovL-xCovR; //Prevents overcounting
		xDiff = Math.max(0, xDiff);
		ans-=yCovL*xDiff;
		ans-=yCovR*xDiff;
		System.out.println(Math.max(ans,0));	
	}
}