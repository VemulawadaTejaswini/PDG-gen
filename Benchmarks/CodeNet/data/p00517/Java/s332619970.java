import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0594().doIt();
	}
	
	class AOJ0594{
		int w,h,n;
		int[] list;
		int[][] map;
		
		int keisan(int ax,int ay,int bx,int by){
			int result = 0;
			int sx = bx-ax;
			int sy = by-ay;
			if((sx>=0&&sy>=0)||(sx<=0&&sy<=0)){
				sx = Math.abs(sx);sy = Math.abs(sy);
				int a = Math.abs(sx-sy);
				int b = Math.max(sx, sy)-a;
				result=a+b;
			}else if((sx<0&&sy>=0)||(sx>=0&&sy<0)){
				result=Math.abs(sx)+Math.abs(sy);
			}
			return result;
		}
		
		void doIt(){
			w = in.nextInt();h = in.nextInt();n = in.nextInt();
			list = new int[n];map = new int[h][w];
			int sx = in.nextInt()-1,sy = in.nextInt()-1;
			int result = 0;
			for(int i=1;i<n;i++){
				int ax = in.nextInt()-1;
				int ay = in.nextInt()-1;
				result += keisan(sx,sy,ax,ay);
				sx = ax; sy = ay;
			}
			System.out.println(result);
		}
	}
	
}