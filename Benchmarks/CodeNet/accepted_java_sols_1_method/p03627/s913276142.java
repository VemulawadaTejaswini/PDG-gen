import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N =sc.nextLong();
		Map<Long,Long>  map= new HashMap();
		for (long i=0;i<N;i++) {
			long a = sc.nextLong();
			Long count = map.get(a);
			if (count ==null) {
				map.put(a, 1l);
			} else {
				map.put(a, count+1);
			}
		}
		Set<Long> set = map.keySet();
		Object[] array = set.toArray();
		Arrays.sort(array);
		int i=array.length-1;
		long x=0;
		long y=0;
		for (;i>=0;i--) {
			Long count= (Long)map.get(array[i]);
			if (count >=4) {
				System.out.println((Long)array[i]*(Long)array[i]);
				return;
			} else if (count >=2) {
				x = (Long)array[i];
				i--;
				break;
			}
		}
		for (;i>=0;i--) {
			Long count= map.get(array[i]);
			if (count >=2) {
				y = (Long)array[i];
				break;
			}
		}
		System.out.println(x*y);
	}
}