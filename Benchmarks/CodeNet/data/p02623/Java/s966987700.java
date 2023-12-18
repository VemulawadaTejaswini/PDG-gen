import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st= new StringTokenizer(br.readLine().trim());
	    int n=Integer.parseInt(st.nextToken()); 
	    int m=Integer.parseInt(st.nextToken());
	    int k=Integer.parseInt(st.nextToken());
	    int a[]=new int [n];
	    int b[]=new int [m];
	    StringTokenizer st1= new StringTokenizer(br.readLine().trim());
	    for(int i=0;i<n;i++) a[i]=Integer.parseInt(st1.nextToken());
	     StringTokenizer st2= new StringTokenizer(br.readLine().trim());
	     for(int i=0;i<m;i++) b[i]=Integer.parseInt(st2.nextToken());
	     int count=0;long time=0;
	     int i=0;int j=0;
	     while(time<k )
	     {
	       if(i<n && j<m)
	       {
	        if(a[i]>b[j])
	        {
	            time+=b[j];
	            if(time>k) break;
	            count++;
	            j++;
	        }
	        else
	        {
	            time+=a[i];
	            if(time>k) break;
	            count++;
	            i++;
	        }
	       }
	       else if(i<n)
	       {
	           time+=a[i];
	            if(time>k) break;
	            count++;
	            i++;
	       }
	       else{
	           
	            time+=b[j];
	            if(time>k) break;
	            count++;
	            j++;
	           
	       }
	    }
	    System.out.println(count);
	}
}
