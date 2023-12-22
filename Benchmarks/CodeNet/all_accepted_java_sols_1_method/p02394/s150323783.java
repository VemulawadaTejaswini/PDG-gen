import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int W = sin.nextInt();
		int H = sin.nextInt();
		int x = sin.nextInt();
		int y = sin.nextInt();
		int r = sin.nextInt();
		int x1, x2, y1, y2;
		x1 = x + r;
		x2 = x - r;
		y1 = y + r;
		y2 = y - r;
		if(x2 >= 0 && y2 >= 0 && x1 <= W && y1 <= H){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
