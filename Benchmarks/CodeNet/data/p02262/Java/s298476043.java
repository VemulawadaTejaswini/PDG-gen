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
	    
	    int m = n / 4;
	    if (m < 1) {
	        m = 1;
	    }
	    
	    //int[] G = new int[m];
	    int[] G = { 523, 521, 509, 503, 499, 491, 487, 479, 467, 463, 461, 457, 449, 443,
	        439, 433, 431, 421, 419, 409, 401, 397, 389, 383, 379, 373, 367, 359, 353, 349,
	        347, 337, 331, 317, 313, 311, 307, 293, 283, 281, 277, 271, 269, 263, 257, 251,
	        241, 239, 233, 229, 227, 223, 211, 199, 197, 193, 191, 181, 179, 173, 167, 163,
	        157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73,
	        71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2, 1 };
	    
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
