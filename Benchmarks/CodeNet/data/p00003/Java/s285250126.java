import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
	    {
		int a,b,c,tmp;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) || Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2))System.out.println("YES");
		else System.out.println("NO");
	    }
    }
}