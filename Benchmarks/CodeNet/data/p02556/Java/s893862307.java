import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    static int sum(int arr[], int n) 
    { 
        Arrays.sort(arr); 
        int res = 0, sum = 0; 
        for (int i = 0; i < n; i++) { 
            res += (arr[i] * i - sum); 
            sum += arr[i]; 
        } 
        return res; 
    } 
    static int totaldist(int x[],  
                            int y[], int n) 
    { 
        return sum(x, n)+sum(y, n); 
    } 
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] x=new int[n];
      int[] y=new int[n];
      for(int i=0;i<n;i++){
          x[i]=sc.nextInt();
          y[i]=sc.nextInt();
      }
      int dist=totaldist(x,y,n);
      System.out.println(dist);
	}
}