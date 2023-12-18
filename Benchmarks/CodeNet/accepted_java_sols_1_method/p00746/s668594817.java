import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			int xs[] = new int[n], ys[] = new int[n];
			xs[0] = ys[0] = 1;
			for(int i=1; i<n; i++){
				int pre = in.nextInt();
				int dir = in.nextInt();
				xs[i] = xs[pre] + (dir==0?-1:dir==2?1:0);
				ys[i] = ys[pre] + (dir==1?-1:dir==3?1:0);
			}
			Arrays.sort(xs);
			Arrays.sort(ys);
			System.out.printf("%d %d\n", xs[n-1] - xs[0] + 1, ys[n-1] - ys[0] + 1);
		}
	}
}