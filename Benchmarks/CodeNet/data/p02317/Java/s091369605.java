import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int n= cin.nextInt();
		int[]   A    =new int[n];
		int[][] DPlen=new int[n][2]; //DPlen[i]:長さi+1の増加部分列のうちの、[0]最小要素/[1]そのindex。
		int[]   DPi  =new int[n]; //     DPi[i]:A[i]を含むような増加部分列の長さ。
		int MAX= (int)Math.pow(10d,9d);
		
		A[0]= cin.nextInt();
		DPlen[0][0]= A[0];
		DPlen[0][1]= 0;
		DPi[0]= 1;
		
		int k;
		for(k=1;k<n;k++){
			DPlen[k][0]= MAX;
		}
		
		int i,j;
		for(i=1;i<n;i++){
			A[i]= cin.nextInt();
			
			j=0;
			while( DPlen[j][0]<A[i] && DPlen[j][0]!=MAX ){
				j++;
			}
			DPlen[j][0]= A[i];
			DPlen[j][1]= i;
			DPi[i]= j;
		}
		
		i=0;
		while( DPlen[i][0]!=MAX ){
			i++;
		}
		System.out.println(i);
	}
}