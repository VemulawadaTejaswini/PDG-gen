import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
        int n,i,j,v;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        System.out.println(n);
        int m[]=new int[n];
        int k[]=new int[n];
        for(i=0;i<m.length;i++)
        {
        	m[i]=scan.nextInt();
        }
        
        for(i=0;i<m.length;i++)
        {
        	System.out.print(m[i]+" ");
        }
        for(i=1;i<=m.length-1;i++)
        {
        	v=m[i];
        	j=i-1;
        	while(j>=0&&m[j]>v)
        	{
        		m[j+1]=m[j];
        		j--;
        	}
        	m[j+1]=v;
        	System.out.println("");
        	for(j=0;j<m.length;j++)
        	{
        		System.out.print(m[j]+" ");
        	}
        }
        	
        
	}

}