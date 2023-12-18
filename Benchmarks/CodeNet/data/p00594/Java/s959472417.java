import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			
			System.gc();
			int[] count = new int[N];
			int id = 0;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			boolean flag = false;
			for(int i = 0; i < N; i++){
				final int A = sc.nextInt();
				
				if(flag){
					continue;
				}
				
				if(!map.containsKey(A)){
					map.put(A, id++);
				}
				
				int cur_id = map.get(A);
				count[cur_id]++;
				
				if(count[cur_id] > N / 2){
					System.out.println(A);
					flag = true;
				}
			}
			
			if(!flag){
				System.out.println("NO COLOR");
			}
		}

	}

}