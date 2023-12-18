import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println("0.00000 0.00000");
		koch(0,0,100,0,n);
		System.out.println("100.00000 0.00000");

		br.close();
	}

	static void koch(double x1,double y1,double x2,double y2,int n) {

		if (n == 0)
			return;

		double d = Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5)/3;
		double rad = Math.atan2(y2-y1,x2-x1);

		double sx = x1 + Math.cos(rad) * d;
		double sy = y1 + Math.sin(rad) * d;
		double tx = sx + Math.cos(rad) * d;
		double ty = sy + Math.sin(rad) * d;
		double ux = sx + Math.cos(rad + Math.PI/3) * d;
		double uy = sy + Math.sin(rad + Math.PI/3) * d;

		koch(x1,y1,sx,sy,n-1);
		System.out.printf("%.5f %.5f\n",sx,sy);
		koch(sx,sy,ux,uy,n-1);
		System.out.printf("%.5f %.5f\n",ux,uy);
		koch(ux,uy,tx,ty,n-1);
		System.out.printf("%.5f %.5f\n",tx,ty);
		koch(tx,ty,x2,y2,n-1);
	}
}