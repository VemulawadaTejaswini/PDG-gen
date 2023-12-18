import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	  String st1=s.next();
	  String st2=s.next();
	  int ans=0;
	  for(int i=0;i<st1.length();i++)
	  {	
		if(st1.charAt(i)!=st2.charAt(i))
		ans++;
	  }
	System.out.println(ans);
	}
}