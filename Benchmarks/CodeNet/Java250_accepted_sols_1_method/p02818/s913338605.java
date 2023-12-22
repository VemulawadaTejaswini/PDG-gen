import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 long a=s.nextLong();
	 long b=s.nextLong();
	 long k=s.nextLong();
	 if(k>a)
	 {
	 k=k-a;a=0;}
	 else
	 {a=a-k;
	 k=0;}
	 b=b-k;
	 if(b<0)
	 b=0;
	 System.out.println(a+" "+b);}}