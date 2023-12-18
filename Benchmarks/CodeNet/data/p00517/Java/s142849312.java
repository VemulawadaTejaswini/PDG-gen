import java.util.Scanner;

public class Main {
	public static long keisan(int ax,int ay,int bx,int by){
		int sx = bx-ax;
        int sy = by-ay;
        if(sx>=0&&sy>=0)return Math.max(sx, sy);
        else if(sx<=0&&sy<=0)return Math.max(-sx, -sy);
        else if(sx>0&&sy<0)return sx-sy;
        else return sy-sx;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); int h = sc.nextInt(); int n = sc.nextInt();
		int sx = sc.nextInt() - 1; int sy = sc.nextInt() - 1;
		long result = 0;
		for(int i = 1; i < n; i++){ //N
			int ax = sc.nextInt() - 1;
			int ay = sc.nextInt() - 1;
			result += keisan(sx,sy,ax,ay);
				sx = ax; sy = ay;
		}
		System.out.println(result);
	}
}