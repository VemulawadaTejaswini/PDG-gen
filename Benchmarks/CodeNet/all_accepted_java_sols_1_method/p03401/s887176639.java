import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int[] A = new int[N];
        long distance = 0;
        
        for(int i = 0;i<N;i++){
        	A[i] = in.nextInt();
        	if(i==0)
        		distance += Math.abs(A[i]);
        	else if(i!=0)
        		distance += Math.abs(A[i]-A[i-1]);
        }
        	distance += Math.abs(A[N-1]);
        	
        int dis = 0;
        
        for(int i = 0;i<N;i++){
        	
        	if(i==0)
        		dis = Math.abs(A[i])+Math.abs(A[i]-A[i+1])-Math.abs(A[i+1]);
        	else if(i==N-1)
        		dis = Math.abs(A[i]-A[i-1])+Math.abs(A[i])-Math.abs(A[i-1]);
        	else
        		dis = Math.abs(A[i]-A[i-1])+Math.abs(A[i]-A[i+1])-Math.abs(A[i+1]-A[i-1]);
        		
        	System.out.println(distance-dis);
        
        }
        in.close();
    }

	
}
