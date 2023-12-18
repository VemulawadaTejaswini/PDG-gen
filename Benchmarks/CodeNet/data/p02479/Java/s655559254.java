import java.util.*;

class Main
{
    public static void main(String args[])
    {
	double r,s,l;
	Scanner sc = new Scanner(System.in);
	r = sc.nextDouble();
	s = r*r*Math.PI;
	l = 2*r*Math.PI;

	System.out.println(s+" "+l);
    }
}