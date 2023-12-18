import java.util.*;
import java.lang.*;
public class Main{
	  public static void main(String args[])
	  {
	    Scanner sc=new Scanner(System.in);
	    int K=sc.nextInt();
        String S=sc.nextLine();
	    if(S.length()<=K)
	    {
	      System.out.println(" "+S);
	    }
	    else
	    {
	      StringBuilder s1=new StringBuilder();
	      String s2="...";
	      String str=S.substring(0,K);
	      //s1.append("...");
	      str=str+"...";
	      System.out.println(" "+str);
	    }
	  }
	}

