import java.util.*;
import java.io.*;

public class Main{
	public static int[] solve(int n){
		int[] ans = new int[2];
		ans[0] = n; ans[1] = n;
		if( n%2 == 0 ){
			ans[0] = n-1;
			ans[1] = n+1;
		} else if( n == 3 ){
			ans[0] = 2;
			ans[1] = 5;
			return ans;
		} else {
			ans[0] = n-2;
			ans[1] = n+2;
		}
		for(int i = 3; i <= Math.sqrt(ans[0]); i += 2){
			if( ans[0]%i == 0 ){
				ans[0] -= 2;
				i = 1;
			}
		}
		for(int i = 3; i <= Math.sqrt(ans[1]); i += 2){
			if( ans[1]%i == 0 ){
				ans[1] += 2;
				i = 1;
			}
		}
		return ans;
	}
		
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<int[]> result = new ArrayList<int[]>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			
			while( stdIn.hasNext() ){
				int n = stdIn.nextInt();
				int[] ans = solve(n);
				result.add(ans);
			}
			for(int[] list : result){
				System.out.println(list[0] + " " + list[1]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}