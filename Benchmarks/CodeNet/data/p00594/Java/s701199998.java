import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			
			System.gc();

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(N);
			
			for(int i = 0; i < N; i++){
				final int A = sc.nextInt();
				
				int value = 0;
				if(map.containsKey(A)){
					value = map.get(A);
				}
				value++;
				
				map.put(A, value);
			}
			//System.out.println(map);
			
			Set<Entry<Integer, Integer>> set = new TreeSet<Entry<Integer, Integer>>(new Comparator<Entry<Integer, Integer>>(){

				@Override
				public int compare(Entry<Integer, Integer> arg0,
						Entry<Integer, Integer> arg1) {
					if(arg1.getValue() != arg0.getValue()){
						return arg1.getValue() - arg0.getValue();
					}
					return 0;
				}
				
			});
			
			set.addAll(map.entrySet());
			
			for(Entry<Integer, Integer> entry : set){
				//System.out.println(entry.getValue());
				
				if(entry.getValue() <= N / 2){
					System.out.println("NO COLOR");
				}else{
					System.out.println(entry.getKey());
				}
				
				break;
			}
		}

	}

}