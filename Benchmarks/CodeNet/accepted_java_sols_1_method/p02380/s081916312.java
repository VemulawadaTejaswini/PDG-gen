import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		double a=in.nextDouble(),b=in.nextDouble(),c=Math.toRadians(in.nextDouble());
		double S=a*b*Math.sin(c)/2,L=a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*Math.cos(c))),H=2*S/a;
		out.printf("%f\n%f\n%f\n", S,L,H);
		out.flush();
	}
}

