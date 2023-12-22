

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int H = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		if(r<=x&&r<=y&&r<=(Math.sqrt(x*x+y*y))&&x+r<=W&&y+r<=H&&(Math.sqrt(x*x+y*y)+r<=Math.sqrt(W*W+H*H)))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}

