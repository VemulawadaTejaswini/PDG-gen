import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] a = new int[n][n];
		String[] str; 
		for(int i = 0; i < n; ++i){
			str = br.readLine().split(" ");
			for(int j = 0; j < n; ++j) {
				int u = Integer.parseInt(str[j+1]);
				a[i][j] = (u < 0) ? Integer.MAX_VALUE : u;
			}
		}

		int sum = 0;
		HashSet<Integer> s = new HashSet<Integer>(n);
		s.add(0); // first node
		while(s.size() != n){
			int min = Integer.MAX_VALUE;
			int newNode = 0;
			for(int node : s){
				for(int i = 0; i < n; ++i){
					if(s.contains(i)){
						continue;
					}
					if(min > a[node][i]){
						min = a[node][i];
						newNode = i;
					}
				}
			}
			sum += min;
			s.add(newNode);
		}
		System.out.println(sum);
		
	}

}