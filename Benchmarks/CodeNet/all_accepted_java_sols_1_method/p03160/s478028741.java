

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int N=Integer.valueOf(st);
		String[] cmd=br.readLine().split(" ");
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.valueOf(cmd[i]);
		}
		int[] minCost=new int[N];
		minCost[0]=0;
		minCost[1]=Math.abs(arr[1]-arr[0]);
		for(int i=2;i<N;i++)
		{
			minCost[i]=Math.min(minCost[i-1]+Math.abs(arr[i]-arr[i-1]),minCost[i-2]+Math.abs(arr[i]-arr[i-2]));
		}
		System.out.println(minCost[N-1]);
	}

	/*private static int minCost(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(j==0)
			return 0;
		if(j==1)
			return Math.abs(arr[1]-arr[0]);
		return Math.min(Math.abs(arr[j]-arr[j-1])+minCost(arr,i,j-1), Math.abs(arr[j]-arr[j-2])+minCost(arr,i,j-2));
	}*/
}
