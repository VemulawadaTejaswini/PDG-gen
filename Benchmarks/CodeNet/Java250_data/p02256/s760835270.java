import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int a,b;

	do
	    {
		a = In.nextInt();
		b = In.nextInt();
	    }while(1 >= a && a >= Math.pow(10,9) && 1 >= b && b >= Math.pow(10,9));


	gcd(a,b);
	
    }
	private static void gcd(int a, int b)
	{
	    int c;
	    if(a < b)
		swap(a,b);

	    while(b > 0)
		{
		    c = a % b;
		    a = b;
		    b = c;
		}
	System.out.println(a);
	}

    private static void swap(int a, int b)
    {
	int d;
	d = a;
	a = b;
	b = d;
    }
}