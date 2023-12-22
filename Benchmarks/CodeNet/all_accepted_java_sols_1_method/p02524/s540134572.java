import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	double a,b,c,C,S,L,h;
	a=cin.nextDouble();
	b=cin.nextDouble();
	C=cin.nextDouble();
	S=0.5*a*b*Math.sin(Math.PI*C/180);
	c=Math.sqrt(a*a+b*b+-2*a*b*Math.cos(Math.PI*C/180));
	L=a+b+c;
	h=2*S/a;
	System.out.println(S);
	System.out.println(L);
	System.out.println(h);
	}

}