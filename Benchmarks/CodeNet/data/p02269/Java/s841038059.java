import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO ?????????????????????????????????????????????
        int n,i,j,k,l,m,o;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        String z;
        String a[]=new String [2*n];
        String b[]=new String [n];
        String c[]=new String [n];
        String d[]=new String [n];
        j=0;
        k=0;
        o=0;
        for(i=0;i<2*n;i++)
        {
        	a[i]=scan.next();
        }
        for(i=0;i<2*n;i=i+2)
        {
        	d[o]=a[i]+a[i+1];
        	o++;
        }
        for(i=0;i<n;i++)
        {
        	m=0;
        	z=d[i];
        	if(z.startsWith("i"))
        	{
        		b[j]=d[i].substring(6);
        		j++;
        	}
        	else
        	{
        		c[k]=d[i].substring(4);
        		for(l=0;l<j;l++)
        		{
        			if(c[k].equals(b[l]))
        			{
        				m=1;
        			}
        		}
        		if(m==1)
        		{
        			System.out.println("yes");
        			k++;
        		}
        		else
        		{
        			System.out.println("no");
        			k++;
        		}
        	}
        }
       
        
        
	}

}