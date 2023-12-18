import java.util.*;
public class Main {
	static int ans;
	
	static int dfs(int depth, int sum, int before) {
		if(depth == 0) return(0);
		int count = 0;
		
		for(int r = before; r < 10; r++) {
			sum += r;
			count += dfs(depth - 1, sum, before + 1);
			if(sum == ans && depth == 1) 
				count++;
		}
		return(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = -1;
		ans = -1;
		while(ans != 0 && n != 0) {
			n = stdIn.nextInt();
			ans = stdIn.nextInt();
			if(n == 0 && ans == 0) break;
			
			int result = dfs(n, 0, 0);
			System.out.println(result);
			
		}
	}
}