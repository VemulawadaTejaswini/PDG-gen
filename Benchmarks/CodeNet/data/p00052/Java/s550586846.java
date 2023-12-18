import java.util.*;

public class Main{
	public static long solve(long n){
		long div = 5;
		long sum = 0;
		while( div <= n ){
			sum += n/div;
			div *= 5;
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Long> result = new ArrayList<Long>();
		
		long n;
		while( (n = stdIn.nextLong()) != 0 ){
			result.add(solve(n));
		}
		for(Long num : result){
			System.out.println(num);
		}
	}
}