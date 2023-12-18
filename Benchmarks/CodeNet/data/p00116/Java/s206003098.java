import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int H = in.nextInt(), W = in.nextInt();
			if (H == 0)
				break;

			int dp[][] = new int[H][W];
			for (int i = 0; i < H; i++) {
				String str = in.next();
				for (int j = 0; j < W; j++) {
					dp[i][j] = str.charAt(j) == '.' ? 1 : 0;
				}
			}

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (i - 1 >= 0 && dp[i][j] > 0 && dp[i - 1][j] > 0)
						dp[i][j] = dp[i - 1][j] + dp[i][j];
				}
			}
			
			int max=0;
			for(int i=0;i<H;i++) {
				Stack<rect> stk=new Stack<>();
				for(int j=0;j<W;j++) {
					rect rct=new rect(dp[i][j],j);
					if(stk.isEmpty() || rct.h>stk.peek().h) {
						stk.push(rct);
					}
					else if(rct.h<stk.peek().h) {
						max=Math.max(max, cRect(stk,rct));
					}
				}
				max=Math.max(max, cRect(stk,new rect(0,W)));

			}
			
			System.out.println(max);
		}
	}
	
	static int cRect(Stack<rect> stk,rect rct) {
		int max=0,p=0;
		while(!stk.isEmpty()) {

			int h=stk.peek().h,i=stk.peek().i;
			if(h<rct.h)break;
			
			max=Math.max(max, h*(rct.i-i));
			p=i;
			stk.pop();
		}
		stk.push(new rect(rct.h,p));
		return max;
	}

}

class rect{
	int h,i;
	rect(int a,int b){
		h=a; i=b;
	}
}
