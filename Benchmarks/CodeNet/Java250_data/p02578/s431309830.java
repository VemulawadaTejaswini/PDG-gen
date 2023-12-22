import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n;
		long sum=0;
      n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
        if(i>0&&a[i]<a[i-1])
        {
          sum=sum+(a[i-1]-a[i]);
          a[i]=a[i-1];
        }
      }
      System.out.println(sum);
}
}
