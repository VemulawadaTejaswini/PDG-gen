
import java.util.*;
import java.math.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 String c=s.next();
	 int count=0;
	 int n=c.length();
	 for(int i=0,j=n-1;i<n;i++,j--)
	 {if(c.charAt(i)!=c.charAt(j))
	 count++;}
	 System.out.println(count/2);
}}