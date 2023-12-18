

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] W=new int[n];
		String[] in=br.readLine().split("\\s+");
		
		for(int i=0;i<n;i++){
			W[i]=Integer.parseInt(in[i]);
		}
		System.out.println(minCost(W));
	}

	public  static int minCost(int[] W){
		int[] sort=W.clone();
		Arrays.sort(sort);
		int cost=0;
		for(int i=0;i<W.length;i++){
			int a=indexOf(W,sort[i]);
			int j=0;
			while(a>i){
				j++;
				int b=indexOf(W, sort[a]);
				cost+=W[b];
				
				int work=W[a];
				W[a]=W[b];
				W[b]=work;
				
				a=b;
			}
			cost+=Math.min(sort[i]*j, sort[i]*2+sort[0]*(j+2));
		}
		return cost;
	}

	private static int indexOf(int[] A, int x) {
		// TODO Auto-generated method stub
		for(int i=0;i<A.length;i++){
			if(A[i]==x)
				return i;
		}
		
		return -1;
	}
}

