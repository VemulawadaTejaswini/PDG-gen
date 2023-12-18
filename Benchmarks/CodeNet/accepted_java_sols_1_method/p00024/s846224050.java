import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext())
	    {
	double t,v,y;
	int n;
	v=scan.nextDouble();
	t=v/9.8;
	y=4.9*(Math.pow(t,2));
	n=(int)(y+5)/5;
	if(((y+5)%5)>0)n++;
	System.out.println(n);
	    }
    }
}