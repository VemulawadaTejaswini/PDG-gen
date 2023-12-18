import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] dat=br.readLine().split(" ");
		int a,b,c;
		double S,L,h;
		a=Integer.parseInt(dat[0]);
		b=Integer.parseInt(dat[1]);
		c=Integer.parseInt(dat[2]);
		S=0.5*a*b*Math.sin(Math.toRadians(c));
		h=b*Math.sin(Math.toRadians(c));
		L=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)));
		System.out.printf("%.8f\n",S);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",h);
	