import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	double a,b,c;
	double C,S,L,h;

	a = in.nextDouble();
	b = in.nextDouble();
	C = in.nextDouble();

	h = b*Math.sin(C/180*Math.PI);
	S = a*h/2;
	c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(C/180*Math.PI));
	
	System.out.printf("%.8f\n%.8f\n%.8f\n",S,a+b+c,h);
    }
}

