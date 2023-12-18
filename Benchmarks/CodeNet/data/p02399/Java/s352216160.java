import java.util.Scanner;
class exe9
{
    public static void main(String args[])
    {
	int a,b,d,r;
	float f;
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	d=a/b;
	r=a%b;
	f=(float)a/(float)b;
	System.out.printf("%d %d %f\n",d,r,f);
    }
}