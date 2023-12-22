import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		long[] H = new long[N];
		for(int i = 0; i < N; i++) {
			H[i] = s.nextLong();
		}
		Map<Integer, Set<Integer>> map = new HashMap<>();
		int a,b;
		for(int i = 0; i< M; i++) {
			a = s.nextInt();
			b = s.nextInt();
			map.computeIfAbsent(a, set -> new HashSet<>()).add(b);
			map.computeIfAbsent(b, set -> new HashSet<>()).add(a);
		}
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			Iterator<Integer> itr = map.getOrDefault(i + 1, Collections.emptySet()).iterator();
			if(!itr.hasNext()) {
				result++;
			}
			while(itr.hasNext()) {
				if(H[i] <= H[itr.next() - 1]) {
					break;
				}
				if(!itr.hasNext()) {
					result++;
				}
				
			}
		}
		System.out.println(result);
    }
}