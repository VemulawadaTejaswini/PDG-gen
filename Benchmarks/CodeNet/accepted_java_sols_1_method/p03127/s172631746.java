import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
			
			if (map[i] == 1) {
				System.out.println(1);
				return;
			}
		}
		
		Arrays.sort(map);
		
		int index = 1;
		int minIndex = 0;
		long min = map[0];
		while(true) {
			long nextMin = min;
			for (int i = index; i < N; i++) {
				long dm = map[i] % min;
				
				if (dm == 0)
					continue;
				
				if (dm < nextMin) {
					nextMin = dm;
					minIndex = i;
				}
				
			}
			
			if (min == nextMin)
				break;
			else {
				min = nextMin;
				map[minIndex] = min;
				index = 0;
			}
				
				
		}
		
		System.out.println(min);
	}
	
}
