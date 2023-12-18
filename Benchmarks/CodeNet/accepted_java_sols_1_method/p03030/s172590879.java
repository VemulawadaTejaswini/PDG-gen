import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Map<Integer,Integer>> restaurants = new TreeMap<>();
 
		int N=sc.nextInt();
 
 
		for(int i=0;i<N;i++) {
			String str = sc.next();
			int n = sc.nextInt();
			if(!restaurants.containsKey(str)) {
				restaurants.put(str, new TreeMap<>(Comparator.reverseOrder()));
			}
			restaurants.get(str).put(n,i+1);
		}
 
		for(Map.Entry<String,Map<Integer,Integer>> e: restaurants.entrySet()) {
			for(Map.Entry<Integer,Integer> ee : e.getValue().entrySet()) {
				System.out.println(ee.getValue());
			}
		}
	}
}