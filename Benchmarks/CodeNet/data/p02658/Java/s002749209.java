import java.util.Scanner;
public class solution
{
	public static void main(String args[])
	{
		Scanner.in=new Scanner(System.in);
		int n=in.nextInt();
		int p=1;
		for(int i=0;i<n;i++)
          {
              int a=in.nextInt();
		      p=p*a;
		      
          }
		      
		      System.out.println(p);
	}
}