import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int m=n/2;
    String a=s.substring(0,m);
    String b=s.substring(m,s.length());
    if(n%2!=0) {
      System.out.println("No");
    }
    else if(s.equals(a+a)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
	}
}