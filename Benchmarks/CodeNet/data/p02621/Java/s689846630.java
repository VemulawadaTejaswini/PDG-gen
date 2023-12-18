import java.util.*;
import java.lang.*;
import java.io.*;

class solution {
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      for(i=1;i<=3;i++)
      {
        int res=Math.pow(n,i);
        sum=sum+res;
        System.out.println(sum);
      } 
	}
}