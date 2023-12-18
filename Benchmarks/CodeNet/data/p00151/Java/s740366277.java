
import java.util.*;
public class Main {
	
	static boolean[][] field;
	static int n;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			n=in.nextInt();
			if(n==0)break;
			
			int res=0;
			field=new boolean[n][n];
			
			for(int i=0;i<n;i++) {
				String str=in.next();
				char[] m=str.toCharArray();
				for(int j=0;j<n;j++) {
					field[i][j]= (m[j]=='1')? true :false;
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(field[i][j]) {
						res=Math.max(res, countSystem(i,j));
					}
				}
			}
			
			System.out.println(res);
		}
	}
	
	static int countSystem(int y,int x) {
		int res=0;
		
		int dy[]= {-1,-1,0,1,1,1,1,0,-1},dx[]= {0,1,1,1,0,-1,-1,-1};
		for(int i=0;i<8;i++) {
			res=Math.max(res, 1+countOne(y,x,dy[i],dx[i]));
		}
		
		return res;
	}
	
	static int countOne(int y,int x,int dy,int dx) {
		int py=y,px=x,res=0;
		
		while(true) {
			//System.out.println(res);
			if(py+dy>=0 && py+dy<n && px+dx>=0 && px+dx<n && field[py+dy][px+dx]) {
				py+=dy;px+=dx;
			}
			else break;
			res++;
		}
		
		return res;
	}

}

