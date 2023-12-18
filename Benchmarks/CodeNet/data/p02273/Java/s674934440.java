import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //整数を読み込む
        System.out.println("0.00000 0.00000");
        kock(0,0,100,0,n);
        System.out.println("100.00000 0.00000");
    }
    static void kock(double x1, double y1, double x2, double y2, int n) {
        if(n==0) return;
        double d = Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5)/3;
        double r = Math.atan2(y2-y1, x2-x1);

        double sx = x1 + Math.cos(r)*d;
        double sy = y1 + Math.sin(r)*d;
        double tx = sx + Math.cos(r)*d;
        double ty = sy + Math.sin(r)*d;
        double ux = sx + Math.cos(r + Math.PI/3)*d;
        double uy = sy + Math.sin(r + Math.PI/3)*d;

        kock(x1,y1,sx,sy,n-1);
		System.out.printf("%.5f %.5f\n",sx,sy);
		kock(sx,sy,ux,uy,n-1);
		System.out.printf("%.5f %.5f\n",ux,uy);
		kock(ux,uy,tx,ty,n-1);
		System.out.printf("%.5f %.5f\n",tx,ty);
		kock(tx,ty,x2,y2,n-1);
    }
}

