import java.util.Scanner;
class Main
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
	System.out.println(d+" "+r+" "+f);
    }
}