import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
	
	public static int sum = 0;
	
	public static int calc (int target) {
		
		boolean[] isPrime = new boolean[target + 1];
		Arrays.fill(isPrime, true);
		
		int lim = (int)Math.sqrt(target);
		for (int i = 4; i < isPrime.length; i += 2) isPrime[i] = false;
		for (int i = 3; i <= lim; i += 2) {
			for (int j = 3; i * j < isPrime.length; j += 2)
				isPrime[i * j] = false;
		}
		for (int i = 2; i < isPrime.length; i++) 
			if (isPrime[i]) sum++;
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			int n = Integer.parseInt(s);
			ans.add(calc(n));
			sum = 0;
			
		}
		
		for (int a : ans) {
			System.out.println(a);
		}
		
	}

}