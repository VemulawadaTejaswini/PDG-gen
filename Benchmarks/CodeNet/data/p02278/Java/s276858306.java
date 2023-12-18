import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] W = new int[n];
		String[] in = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			W[i] = Integer.parseInt(in[i]);
		}
		System.out.printf("%d\n", minCostSort(W));
	}

	public static int indexOf(int[] A, int x){
		for(int i = 0; i < A.length; i++){
			if(A[i] == x){
				return i;
			}
		}
		return -1;
	}

	public static int minCostSort(int[] W){
		int[] sorted = W.clone();
		Arrays.sort(sorted);
		int cost = 0;
		for(int i = 0; i < W.length; i++){
			int a = indexOf(W, sorted[i]);
			int j = 0;
			while(a > i){
				j++;
				int b = indexOf(W, sorted[a]);
				cost += W[b];
				int work = W[a];
				W[a] = W[b];
				W[b] = work;
				a = b;
			}
			cost += Math.min(sorted[i] * j, sorted[i] * 2 + sorted[0] * (j+2));
		}
		return cost;
	}
}