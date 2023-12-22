import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] town = new String[N];
		Set<String> town2 = new TreeSet<>();
		int[] point = new int[N];
		for(int i=0;i<N;i++) {
			town[i]=sc.next();
			town2.add(town[i]);
			point[i]=sc.nextInt();
		}

		for(String s: town2) {
			Map<Integer,Integer> nums = new TreeMap<>(Comparator.reverseOrder());
			for(int i=0;i<N;i++) {
				if(s.equals(town[i])) {
					nums.put(point[i],i+1);
				}
			}

			for(Integer n : nums.keySet()) {
				System.out.println(nums.get(n));
			}
		}

	}
}