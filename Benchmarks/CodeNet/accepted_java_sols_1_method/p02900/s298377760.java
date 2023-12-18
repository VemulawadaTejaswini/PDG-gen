import java.util.*;
import java.lang.Math;

public class Main{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a > b){
			long tmp = a;
			a = b;
			b = tmp;
		}
			
		double ub = Math.sqrt(a);
		List<Long> divisors = new ArrayList<>();
		for(long i = 1L; i <= ub; ++i){
			if(a % i == 0L){
				divisors.add(i);
				long qa = a / i;
				if(i != qa){
					divisors.add(qa);
				}
			}
		}
		
		int ans = divisors.size();
		for(int i = 0; i < divisors.size(); ++i){
			if(b % divisors.get(i) != 0L){
				divisors.set(i, 0L);
				--ans;
			}
		}
		
		Collections.sort(divisors);
		//System.out.println(divisors);
		
		for(int i = 0; i < divisors.size(); ++i){
			if(divisors.get(i) == 0L) continue;
			
			if(divisors.get(i) == 1L || i == divisors.size() - 1L) continue;
			
			for(int j = i + 1; j < divisors.size(); ++j){
				if(divisors.get(j) > 0L && divisors.get(j) % divisors.get(i) == 0L){
					divisors.set(j, 0L);
					--ans;
				}
			}
		}
		
		System.out.println(ans);
	}
}