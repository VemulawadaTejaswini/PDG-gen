/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int[] A = new int[n];
		
		String[] arrayStr = scanner.nextLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(arrayStr[i]);
		}
		
		printArray(A);
		
		int v,j;
		for (int i = 1; i < n; i++) {
			v = A[i];
			j = i - 1;
			
			while (j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			
			printArray(A);	
		}
		
	}
	
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
