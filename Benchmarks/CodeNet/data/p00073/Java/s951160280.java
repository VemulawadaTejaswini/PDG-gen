import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int x,h;
		x=scan.nextInt();
		h=scan.nextInt();
		if(x==0 && h==0)break;
		double ans,length;
		length=Math.sqrt(Math.pow(x/2,2)+Math.pow(h,2));
		ans=Math.pow(x,2)+2*((x*length));
		System.out.printf("%.6f\n",ans);
	    }
    }
}