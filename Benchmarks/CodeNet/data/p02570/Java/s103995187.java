import java.util.Scanner;
class hacker
{
	public static void main(String args[])
	{
		double d,t,s;
		Scanner scan=new Scanner(System.in);
		d=scan.nextDouble();
		t=scan.nextDouble();
		s=scan.nextDouble();
		if(d/s<=t)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
