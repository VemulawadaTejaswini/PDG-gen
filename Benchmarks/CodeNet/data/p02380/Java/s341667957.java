import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),
			b=sc.nextInt(),
			rad=sc.nextInt();
		double s,l,h,c,a2,b2,min,r=0.0;
		
		a2=Math.pow(a, 2.0);
		b2=Math.pow(b, 2.0);
		r=Math.cos(((double)rad/180.0)*Math.PI);
		min=(2.0*a*b)*r;
		
		c = Math.sqrt(a2+b2-min);
		l = a+b+c;
		s = ((((a*b)*(Math.sin((double)rad/180.0)*Math.PI)))/2.0);
		h=(s/c)*2.0;
		
		System.out.printf("%d\n%d\n%d\n",(int)s,(int)l,(int)h);
	}

}
