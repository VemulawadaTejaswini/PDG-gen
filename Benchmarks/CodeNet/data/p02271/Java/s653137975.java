import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
		static int n;
		static int[] A;
		static int q;
		static int m;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		
		n = Integer.parseInt(br.readLine());
		A = new int[n];
		
		str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		q = Integer.parseInt(br.readLine());
		
		str = br.readLine().split(" ");
		for(int i = 0; i < q; i++){
			m = Integer.parseInt(str[i]);
			
			System.out.println(dfs(0, 0)?"yes" : "no");
		}
		
	}
	
	public static boolean dfs(int i, int sum){
		if(sum == m) return true;
		
		if(i == n) return false;
		
		if(dfs(i + 1, sum)) return true;
		
		if(dfs(i + 1, sum + A[i])) return true;
		
		return false;
	}
}
