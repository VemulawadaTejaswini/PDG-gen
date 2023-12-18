import java.uttil.*;
public class Main
{
  	public static void main(String[] args)	
    {
      	Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int x=s.nextInt();	
      	int t=s.nextInt();
      	System.out.println((int)(t*Math.ceil(((double)n)/(double)x))));
    }
}