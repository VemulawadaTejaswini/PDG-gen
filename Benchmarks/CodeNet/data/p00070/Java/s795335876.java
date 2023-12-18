import java.util.*;
import java.io.*;

public class Main{
	public static int solve(int n, int s, Set<Integer> record){
		int a = s/n;
		if( n > 10 ){
			return 0;
		}
		if( s > 285 ){
			return 0;
		}
		if( a > 9 ){
			a = 9;
		}
		if( s < 0 ){
			return 0;
		}
		if( n == 1 ){
			if( record.contains(s) || s > 9 ){
				return 0;
			} else {
				return 1;
			}
		}
		int count = 0;
		for(int i = a; i >= 0; i--){
			if( record.contains(i) ){
				continue;
			}
			record.add(i);
			count += solve(n-1,s-i*n,record);
			record.remove(i);
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
				Set<Integer> record = new HashSet<Integer>();
				result.add(solve(n,s,record));
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