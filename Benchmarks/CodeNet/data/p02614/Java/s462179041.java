import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
	    int w = sc.nextInt();
	    int k = sc.nextInt();
	    int[][] c = new int[h][w];
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
		        if(s.charAt(j) == '#') c[i][j] = 1;
		      }
		}
		int ans = 0;
		for(int i = 0; i < (int)Math.pow(2, h); i++) {
			int black = 0;
			for(int j = 0; j < (int)Math.pow(2, w); j++) {
				for(int s = 0; s < h; s++) {
			        for(int t = 0; t < w; t++) {
			        	if(((i&(1<<s))==0) &&((j&(1<<t))==0)&&(c[s][t]==1)) black++; 
			        }
			    }
				if(black==k) ans++;
			}
		}
		System.out.println(ans);
    }
}