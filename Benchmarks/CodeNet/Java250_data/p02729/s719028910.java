/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		if(n<=1&&m<=1)
		    System.out.println(0);
		else if(n<=1)
		    System.out.println(binomialCoeff(m,2));
		else if(m<=1)
		    System.out.println(binomialCoeff(n,2));
		else
    		System.out.println(binomialCoeff(n,2)+binomialCoeff(m,2));
		
	}
	static int binomialCoeff(int n, int k) 
    { 
        int res = 1;  
        if ( k > n - k ) 
            k = n - k;  
        for (int i = 0; i < k; ++i) 
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
      
        return res; 
    } 
}