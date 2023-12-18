import java.util.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t;
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
		      t = new StringTokenizer(br.readLine());
		      a[i] = Integer.parseInt(t.nextToken());
		      b[i] = Integer.parseInt(t.nextToken());
		      c[i] = Integer.parseInt(t.nextToken());
		} 
		Arrays.fill(A,Integer.MIN_VALUE);
		Arrays.fill(B,Integer.MIN_VALUE);
		Arrays.fill(C,Integer.MIN_VALUE);
		A[n-1] = a[n-1];
		B[n-1] = b[n-1];
		C[n-1] = c[n-1];
		for(int i = n-2 ; i >= 0 ; i--)
		{
		      A[i] = a[i]+Math.max(B[i+1],C[i+1]);
		      B[i] = b[i]+Math.max(A[i+1],C[i+1]);
		      C[i] = c[i]+Math.max(B[i+1],A[i+1]);
		}
		System.out.println(Math.max(Math.max(A[0],B[0]),C[0]));
	}
}