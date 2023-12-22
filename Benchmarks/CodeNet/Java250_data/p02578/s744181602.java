import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		//code
	Scanner in=new Scanner(System.in);
        int t,k,i=0,j=0,sum=0;
        double m;
        long l=0;
            int n=in.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
                
            }
          i=0;
            while(i<n-1)
            {
               if(a[i]>a[i+1])
               {
                   l+=a[i]-a[i+1];
                  // System.out.println("l="+l);
                   a[i+1]=a[i];
                  // System.out.println("a[i+1]="+a[i+1]);
               }i++;
            }
            System.out.println(l);

               
	}
}