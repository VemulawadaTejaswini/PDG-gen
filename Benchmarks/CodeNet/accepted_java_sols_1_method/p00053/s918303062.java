import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Map<Integer, Integer> prime = new LinkedHashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		prime.put(1,2); prime.put(2,5);
		int[] p = new int[10000];
		p[0] = 2; p[1] = 3;
		int k = 2;
	outer:	for(int i = 5; k < 10000; i += 2){
			for(int j = 1; p[j] <= Math.sqrt(i); j++){
				if( i%p[j] == 0 ){
					continue outer;
				}
			}
			p[k] = i;
			k++;
			prime.put(k, prime.get(k-1)+i);
		}
		
		int n;
		while( (n = stdIn.nextInt()) != 0 ){
			result.add(prime.get(n));
		}
		
		for(Integer sum : result){
			System.out.println(sum);
		}
	}
}