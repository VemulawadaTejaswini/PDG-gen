//package Contest169;


import java.util.*;
import java.io.*;
import java.math.*;

import java.math.*;
class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Start here:
        
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        
        long a[]=new long[t];
        
        
        for(int i=0;i<t;i++)
        {
        	a[i]=sc.nextLong();
        }
        
        //BigInteger b=new BigInteger("1000000000000000000");
        //BigInteger ans=BigInteger.ONE;
        long max=1000000000000000000L;
        long ans=1L;
        boolean flag=true;
        Arrays.sort(a);
        for(int i=0;i<t;i++)
        {
        	ans=(long)ans*a[i];
        	
        	if(ans==0)
        	{
        		System.out.println(0);
        		return;
        	}
        	if(ans>max)
        	{
        		System.out.println(-1);
        		return;
        	}
        	/*
        	BigInteger bb=new BigInteger(Long.toString(a[i]));
        	
        	//System.out.println(ans);
        	ans=ans.multiply(bb);
        	
        	if(ans.compareTo(BigInteger.ZERO)==0)
        	{
        		System.out.println(0);
        		return;
        	}
        	if(ans.compareTo(BigInteger.ZERO)<0)
        	{
        		System.out.println(-1);
        		return;
        	}*/
        }
        System.out.println(ans);
  

    }
}