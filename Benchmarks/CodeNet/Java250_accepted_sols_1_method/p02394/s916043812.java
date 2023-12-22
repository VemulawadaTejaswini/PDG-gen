import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		String W,H,X,Y,R;
		int w,h,x,y,r;
		
		Scanner in = new Scanner(System.in);
		
		W = in.next();
		H = in.next();
		X = in.next();
        Y = in.next();
		R = in.next();
		
		w = Integer.parseInt(W);
		h = Integer.parseInt(H);
		x = Integer.parseInt(X);
        y = Integer.parseInt(Y);
		r = Integer.parseInt(R);

		if((r <= x && (w - r) >= x) && (r <= y && (h - r) >= y)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}