import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int D=stdIn.nextInt();
		int E=stdIn.nextInt();
		int a=(A/10+1)*10-A,b=(B/10+1)*10-B,c=(C/10+1)*10-C,d=(D/10+1)*10-D,e=(E/10+1)*10-E;
		int max=0;
		if(a>max&&a!=10)
			max=a;
		if(a==10)
			a=0;
		if(b>max&&b!=10)
			max=b;
		if(b==10)
			b=0;
		if(c>max&&c!=10)
			max=c;
		if(c==10)
			c=0;
		if(d>max&&d!=10)
			max=d;
		if(d==10)
			d=0;
		if(e>max&&e!=10)
			max=e;
		if(e==10)
			e=0;
		System.out.println(A+B+C+D+E+a+b+c+d+e-max);
	}
}