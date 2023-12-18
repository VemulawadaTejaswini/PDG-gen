import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	double t,v,y;
	int n;
	v=Double.parseDouble(input.readLine());
	t=v/9.8;
	y=4.9*(Math.pow(t,2));
	n=(int)(y+5)/5;
	if(((y+5)%5)>0)n++;
	System.out.println(n);
    }
}