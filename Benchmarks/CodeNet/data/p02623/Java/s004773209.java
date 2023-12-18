/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static int count(int n){
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                
                if(i!=(n/i))
                c++;
            }
        }
        return c;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
	    int m=sc.nextInt();
	    int k=sc.nextInt();
	    int a[]=sc.readArray(n);
	    int b[]=sc.readArray(m);
	    long count=0;
	    int i=0,j=0;
	    while(i<n&&j<m){
	        if(a[i]<b[j]&&a[i]<=k){
	          //  System.out.println("in 1");
	            k=k-a[i];
	            count++;
	            i++;
	        }
	        else if(a[i]>b[j]&&b[j]<=k){
	            k=k-b[j];
	            count++;
	            j++;
	        }
	        else if(a[i]==b[j]&&a[i]<=k){
	            k=k-a[i];
	            //System.out.println(k);
	            count++;
	            if(i<n+1&&j<m+1&&a[i+1]<b[j+1]&&a[i+1]<=k)
	            {
	                i++;
	                count++;
	                k=k-a[i];
	            }
	            else if(i<n+1&&j<m+1&&a[i+1]>b[j+1]&&b[j+1]<=k){
	                j++;
	                count++;
	                k=k-b[j];
	            }
	        }
	        else
	        break;
	        
	      //  System.out.println(count);
	    }
	    while(i<n){
	        if (a[i]<=k){
	            k=k-a[i];
	            count++;
	            i++;
	        }
	        else
	        break;
	    }
	    while(j<m){
	        if(b[j]<=k){
	            k=k-b[j];
	            count++;
	            j++;
	        }
	        else
	        break;
	    }
	    System.out.println(count);
	    
		
	}
		static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}
}
