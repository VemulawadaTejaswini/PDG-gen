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

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			boolean flag = false;
			for(int i = 0; i < N; i++){
				final int A = sc.nextInt();
				
				if(flag){
					continue;
				}
				
				int value = 0;
				if(map.containsKey(A)){
					value = map.get(A);
				}
				value++;
				
				if(value > N / 2){
					System.out.println(A);
					flag = true;
				}
				
				map.put(A, value);
			}
			
			if(!flag){
				System.out.println("NO COLOR");
			}
		}

	}

}