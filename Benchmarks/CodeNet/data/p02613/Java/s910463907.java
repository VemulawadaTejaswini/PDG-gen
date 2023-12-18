import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int ac,wa,tle,re;
    for(int i=0;i<n;i++)
    {
    	String s=in.next();
    	if(s=="AC")
    		ac++;
    	else if(s=="WA")
    		wa++;
    	else if(s=="TLE")
    		tle++;
    	else
    		re++;
    }
    System.out.println("AC x "+ac);
    System.out.println("WA x "+wa);
    System.out.println("TLE x "+tle);
    System.out.println("RE x "+re);
    
  }
}
