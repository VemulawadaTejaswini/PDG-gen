import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		int n, k;
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		long[] arr = new long[n];
		long[] cost = new long[n];
		str = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(str[i]);
			cost[i] = Long.MAX_VALUE;
		}
		for(int i=0; i<n; i++) {
			if(i==0) cost[i] = 0;
			for(int j=1; j<=k; j++) {
				if((i-j)>=0) cost[i] = Math.min(cost[i-j]+Math.abs(arr[i]-arr[i-j]), cost[i]);
			}
		}
		System.out.println(cost[n-1]);
	}
}
