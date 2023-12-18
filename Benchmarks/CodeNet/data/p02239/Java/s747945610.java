import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[][] l;
	public static int[] d;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// input & init
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		l = new int[n+1][n+2];
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			for(int j = 1; j < str.length; j++){
				l[u][j-1] = Integer.parseInt(str[j]);
			}
		}

		d = new int[n+1];
		for(int i = 1; i <= n; i++){
			d[i] = -1;
		}
		
		// calc
		DFsearch(1, 0);
				
		// print
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			sb.append(i + " " + d[i] + "\n");
		}
		System.out.print(sb);
	
	}
	
	public static void DFsearch(int id, int pd) {
		if(d[id] == -1 || pd < d[id]){
			d[id] = pd;
		}
		
		pd += 1; // increment present depth
		
		for(int i = 0; i < l[id][0]; i++){
			DFsearch(l[id][i+1], pd);
		}
	}
}