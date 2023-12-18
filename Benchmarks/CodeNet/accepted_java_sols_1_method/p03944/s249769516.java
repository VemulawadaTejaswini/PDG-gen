import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int w1=0,h1=0,w2=stdIn.nextInt(),h2=stdIn.nextInt(),n=stdIn.nextInt(),x,y,a,i,s;
		for(i=0;i<n;i++) {
			x=stdIn.nextInt();
			y=stdIn.nextInt();
			a=stdIn.nextInt();
			if(a==1&&x>w1) w1=x;
			if(a==2&&w2>x) w2=x;
			if(a==3&&y>h1) h1=y;
			if(a==4&&h2>y) h2=y;
		}
		System.out.print((w2-w1)*(h2-h1)>0&&w2-w1>0&&h2-h1>0?(w2-w1)*(h2-h1):0);
	}
}