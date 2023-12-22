import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    String ss=s.next();
    int c=1;
    for(int i=0;i<n-1;i++)
    {
      if(ss.charAt(i)!=ss.charAt(i+1))
        c++;
    }
   
    System.out.println(c);
  }
}