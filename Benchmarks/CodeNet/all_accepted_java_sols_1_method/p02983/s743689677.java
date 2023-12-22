								//package Dynamic;
import java.io.*;
import java.util.*;
class Main 
{
    static public void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //int t=Integer.parseInt(br.readLine());
        //long n=Long.parseLong(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int c=0;
        long l=Long.parseLong(st.nextToken());
        long r=Long.parseLong(st.nextToken());
        long aa=l%2019;
        long bb=r%2019;
        
        long val=l;
        long cc=l%2019;
        long min=99999l;
        //long m=99999;
        for(long xx=l+1;xx<=r;xx++)
        {
        	min=Math.min(min,((l*xx)%2019l));
        	if(min==0)
        	{
        		System.out.println("0");
        		System.exit(0);
        	}
        }
        for(long x=l+1;x<r;x++)
        {
        	for(long xx=x+1;xx<=r;xx++)
            {
            	min=Math.min(min,((x*xx)%2019l));
            	if(min==0)
            	{
            		System.out.println("0");
            		System.exit(0);
            	}
            }
        }
        System.out.println(min);
        
        
        //long d=Long.parseLong(br.readLine());
//        while(st.hasMoreTokens())
//        {
//        	long aa=Long.parseLong(st.nextToken());
//        	
//        }
        //System.out.println((min*min2)%2019);
    }
}