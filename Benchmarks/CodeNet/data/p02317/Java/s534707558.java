import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		final int n= cin.nextInt();
		int[] A    =new int[n];
		int[] DPlen=new int[n+1]; //DPlen[i]:長さi+1の増加部分列のうちの、[0]最小要素/[1]そのindex。
		int MAX= (int)Math.pow(10d,9d);
		
		A[0]= cin.nextInt();
		DPlen[0]= A[0];
		
		int k;
		for(k=1;k<n+1;k++){
			DPlen[k]= MAX;
		}
		
		int i,j;
		for(i=1;i<n;i++){
			A[i]= cin.nextInt();
			
			j=0;
			while( DPlen[j]<A[i] && DPlen[j]!=MAX ){
				j++;
			}
			DPlen[j]= A[i];
		}
		
		i=0;
		while( DPlen[i]!=MAX ){
			i++;
		}
		System.out.println(i);
	}
}