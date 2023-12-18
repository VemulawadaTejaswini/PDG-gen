import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	double a,b,c,S,L,h;
	
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	str=input.readLine();
	String strary[]=str.split(" ");
	a=Double.parseDouble(strary[0]);
	b=Double.parseDouble(strary[1]);
	c=Double.parseDouble(strary[2]);
	S=((a*b)*(Math.sin(Math.toRadians(c)))/2);
	L=a+b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*(Math.cos(Math.toRadians(c))));
	h=(2*S)/a;
	System.out.printf("%f %f %f\n",S,L,h);
    }
}