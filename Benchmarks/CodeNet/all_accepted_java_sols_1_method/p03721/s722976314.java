import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main{
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long k = scan.nextLong();
 
		SortedSet<Long> set = new TreeSet<>();
		Map<Long, Long> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			long a = scan.nextLong();
			long b = scan.nextLong();
			set.add(a);
			if(map.containsKey(a)){
				map.put(a, map.get(a) + b);
			}else{
				map.put(a, b);
			}
		}
 
		for(Iterator it = set.iterator();it.hasNext();){
			long num = (long) it.next();
			k -= map.get(num);
			if(k <= 0){
				System.out.println(num);
				break;
			}
		}
 
	}
 
}
