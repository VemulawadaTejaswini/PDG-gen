import java.*;
import java.util.*;

public class Main{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	circleInRect cr = new circleInRect(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
	cr.judge();
	}
}
class circleInRect{
	int width;
	int height;
	int centx;
	int centy;
 	int rad;
	public circleInRect(int w, int h, int cx,int cy,int r){
		width=w;
		height=h;
		centx=cx;
		centy=cy;
		rad=r;
	}
	public void judge(){
		if(centx-rad<0 || centy-rad<0 || centx+rad>width || centy+rad > height)
			System.out.printf("No\n");
		else
			System.out.printf("Yes\n");
	}
}