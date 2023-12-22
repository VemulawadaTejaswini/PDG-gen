								//package Dynamic;
import java.io.*;
import java.util.*;
class Main 
{
    static public void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        //long n=Long.parseLong(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int ar[]=new int[n];
        int x=0;
        long s=0l;
        while(st.hasMoreTokens())
        {
        	ar[x]=2*Integer.parseInt(st.nextToken());
        	if(x%2==0)
        		s+=ar[x];
        	else
        		s-=ar[x];
        	x++;
        	//System.out.println(s);
        }
        s/=2;
        System.out.print(s+" ");
        for(int xx=0;xx<n-1;xx++)
        {
        	s=ar[xx]-s;
        	System.out.print(s+" ");
        }
    }
}