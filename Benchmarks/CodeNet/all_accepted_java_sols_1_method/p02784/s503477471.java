/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,a,i,t;
        h=sc.nextInt();
        a=sc.nextInt();
        int f=0;
        for(i=0;i<a;i++)
        {
            t=sc.nextInt();
            h-=t;
            if(h<=0)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
        
        
	}
}