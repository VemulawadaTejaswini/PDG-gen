import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  int ans=t+(t*t)+(t*t*t);
	  System.out.println(ans);
	}
}