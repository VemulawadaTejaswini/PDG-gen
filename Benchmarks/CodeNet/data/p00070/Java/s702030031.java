import java.util.*;
import java.io.*;

public class Main{
	public static int solve(int n, int s, boolean[] check){
		if( n > 10 ){
			return 0;
		}
		if( s > 285 ){
			return 0;
		}
		int a = s/n;
		if( a > 9 ){
			a = 9;
		}
		if( n == 1 ){
			if( s > 9 || check[s] ){
				return 0;
			} else {
				return 1;
			}
		}
		int count = 0;
		for(int i = a; i >= 0; i--){
			if( check[i] ){
				continue;
			}
			check[i] = true;
			count += solve(n-1,s-i*n,check);
			check[i] = false;
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int n = stdIn.nextInt(), s = stdIn.nextInt();
				int count = 0;
			//	Set<Integer> record = new HashSet<Integer>();
				boolean[] check = new boolean[10];
				result.add(solve(n,s,check));
			}
			for(Integer sum : result){
				System.out.println(sum);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}