import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] a = new int[n][n];
		String[] str; 
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
				a[i][j] = Integer.MAX_VALUE;
			}
			str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			for(int j = 0; j < k; ++j) {
				int v1 = Integer.parseInt(str[2 + j * 2    ]);
				int c1 = Integer.parseInt(str[2 + j * 2 + 1]);
				a[u][v1] = c1;
			}
		}

		int[] d = new int[n];
		HashSet<Integer> t = new HashSet<Integer>(n);
		for(int i = 0; i < n; i++){
			d[i] = a[0][i];
			t.add(i);
		}
		
		int[] p = new int[n];
		int u = 0;
		p[u] = 0; // first node
		d[p[u]] = 0; // cost
		while(!t.isEmpty()){
			t.remove(p[u]);
			int min = Integer.MAX_VALUE;
			for(int node : t){
				
				if(d[p[u]] + a[p[u]][node] > 0 && d[p[u]] + a[p[u]][node] < d[node]){
					d[node] = d[p[u]] + a[p[u]][node];
				}
				if(d[node] < min){
					min = d[node];
					p[u+1] = node;
				}
			}
			u += 1;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++){
			sb.append(i + " " + d[i] + "\n");
		}
		System.out.print(sb);
	}

}