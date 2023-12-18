/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static int cnt = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int[] A = new int[n];
		
		//String[] arrayStr = scanner.nextLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			//A[i] = Integer.parseInt(arrayStr[i]);
			A[i] = scanner.nextInt();
		}
		
		shellSort(A, n);
		
        System.out.println(cnt);
		
		for(int num: A) {
		    System.out.println(num);
		}
	}
	
	static int[] shellSort(int[] A, int n) {
	    cnt = 0;
	    
	    int m = n / 2;
	    
	    //int[] G = new int[m];
	    int[] G = { 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2, 1 };
	    
	    System.out.println(m);
	    printArray(G, G.length - m);
	    
	    
	    for (int i = G.length - m; i < G.length; i++) {
	        
	        A = insertionSort(A, n, G[i]);
	    }
	    
	    return A;
	}
	
	
	static int[] insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j + g] = v;
        }
        return A;
    }
	
	static void printArray(int[] array, int start) {
		for (int i = start; i < array.length; i++) {
			if (i > start) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
