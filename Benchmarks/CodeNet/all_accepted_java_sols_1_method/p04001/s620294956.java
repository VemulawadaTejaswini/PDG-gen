import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	  static int MOD=1000000007;
	  static long p[][]=new long[405][405];
	  static long sum[][]=new long[405][405];
	  static long dp[][]=new long[35][100005];
	  static long a[]=new long[100005];
	  static long b[]=new long[405];
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
          String s=in.next();
          int len=s.length();
          long sum=0;
          for(int i=0;i<(1<<(len-1));i++)
          {
        	  //System.out.println("i:"+i);
        	  int pos=0;
        	  for(int j=0;j<len-1;j++)
        	  {
        		  if((i&(1<<j))!=0)
        		  {
        			  //System.out.println(s.substring(pos,j+1));
        			  sum+=Long.parseLong(s.substring(pos, j+1));
        			  pos=j+1;
        		  }
        	  }
        	 //System.out.println(s.substring(pos,len));
        	  sum+=Long.parseLong(s.substring(pos, len));
          }
         
       System.out.println(sum);
	}
}
