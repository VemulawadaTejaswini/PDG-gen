import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws java.lang.Exception
    {		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();long y =sc.nextLong();
		long arr1[]=new long[n], arr2[]=new long[m], arr3[]=new long[m+n];
		for(int x=0; x<n; x++) arr1[x]=sc.nextLong();
		for(int w=0; w<m; w++) arr2[w]=sc.nextLong();
		 int i = 0, j = 0, k = 0; 
	      
	        // Traverse both array 
	        while (i < n && j < m) 
	        { 
	            arr3[k++] = arr1[i++]; 
	            arr3[k++] = arr2[j++]; 
	        } 
	      
	        // Store remaining elements of first array 
	        while (i < n) 
	            arr3[k++] = arr1[i++]; 
	      
	        // Store remaining elements of second array 
	        while (j < m) 
	            arr3[k++] = arr2[j++]; 
	        int count=0;long sum=0;
	       for(int h=0; h<arr3.length; h++) {
	    	   if(sum+arr3[h]<=y) {
	    		   sum+=arr3[h];
	    		   ++count;
	    	   }else break;
	       }
	       System.out.println(count);
    }

}