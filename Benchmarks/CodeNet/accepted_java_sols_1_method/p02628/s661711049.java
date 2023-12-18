import java.util.*;
import java.io.*;
import java.lang.*;


class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
		int m = in.nextInt();
		int[] ar = new int[n];
		for(int i = 0 ; i < n ; i++){
			ar[i] = in.nextInt();
		}
		
		Arrays.sort(ar);

		int cost = 0;
		for(int i = 0 ; i < m ; i++){
			cost += ar[i];
		}
		
		System.out.println(cost);
    }
 
}