import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt(),h = scan.nextInt();
		int n = scan.nextInt();
		int x,y,a;
		int w1=0,w2=w,h1=0,h2=h;
		for(int i=0; i<n; i++) {
			x=scan.nextInt();
			y=scan.nextInt();
			a=scan.nextInt();
			if(a==1 && w1<x)w1=x;
			if(a==2 && w2>x)w2=x;
			if(a==3 && h1<y)h1=y;
			if(a==4 && h2>y)h2=y;
		}
		System.out.println(w2-w1>0 && h2-h1>0 ? (w2-w1)*(h2-h1) : 0);
	}

}