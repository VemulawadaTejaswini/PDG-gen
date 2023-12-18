import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long[] A = new long[N];
		Map<Long, Long> map1 = new HashMap<>();
		Map<Long, Long> map2 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			A[i] = s.nextLong();
			if(i + 1 > A[i])
				map1.put(i + 1 - A[i], map1.getOrDefault(i + 1 - A[i], 0l) + 1);
			map2.put(i + 1 + A[i], map2.getOrDefault(i + 1 + A[i], 0l) + 1);

		}

		long result = 0;
		for(Map.Entry<Long, Long> entry : map1.entrySet()) {
			result += entry.getValue() * map2.getOrDefault(entry.getKey(), 0l);
		}

		System.out.println(result);
    }
}
