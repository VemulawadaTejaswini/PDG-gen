import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int sum=0;
      	String s=in.nextLine();
      char ch[]=s.toCharArray();
      for(int i=0;i<s.length();i++)
      {
        	sum=sum+(int)(ch[i]-'0');
      }
      if(sum%9==0)
      {
        	System.out.println("Yes");
      }
      else
      {
        	System.out.println("No");
      }
}
}