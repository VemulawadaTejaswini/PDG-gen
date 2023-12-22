
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int W;
		int N;
		int[] v = new int[1010];
		int[] w = new int[1010];
		int[][] u = new int[1010][1010];
		int count = 1;
		while(true){
			W = Integer.parseInt(sc.next());
			if(W==0){
				break;
			}
			N = Integer.parseInt(sc.next());
			for(int i=0;i<N;i++){
				String str = sc.next();
				String[] num = str.split(",",0);
				v[i+1] = Integer.parseInt(num[0]);
				w[i+1] = Integer.parseInt(num[1]);
			}

			for(int i=1;i<=N;i++){
				for(int j=0;j<=W;j++){
					if(j<w[i]){
						u[i][j] = u[i-1][j];
					}
					else{
						if(u[i-1][j]>u[i-1][j-w[i]]+v[i]){
							u[i][j] = u[i-1][j];
						}
						else{
							u[i][j] = u[i-1][j-w[i]]+v[i];
						}
					}
				}
			}
			int max = u[N][W];
			out.println("Case "+count+":");
			out.println(max);
			out.flush();
			for(int i=1;i<=W;i++){
				if(u[N][i]==max){
					out.println(i);
					out.flush();
					break;
				}
			}
			count++;
		}
	}
}