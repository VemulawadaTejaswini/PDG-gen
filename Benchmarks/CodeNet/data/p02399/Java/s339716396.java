import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int a,b,d,r;
	double f;
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	d=a/b;
	r=a%b;
	f=(float)a/(float)b;
	System.out.printf("%d %d %.5f\n",d,r,f);
    }
}