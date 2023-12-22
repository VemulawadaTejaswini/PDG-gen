import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int m= cin.nextInt();
		final int n= cin.nextInt();
		
		int[][] A= new int[m][n];
		int[]   b= new int[n];
		int[]   c= new int[m];
		
		int i,j;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				A[i][j]= cin.nextInt();
			}
		}
		for(j=0;j<n;j++){
			b[j]= cin.nextInt();
		}
		
		int k;
		for(i=0;i<m;i++){
			for(k=0;k<n;k++){
				c[i]+= A[i][k]*b[k];
			}
		}
		
		for(i=0;i<m;i++){
			System.out.println(c[i]);
		}
	}
}