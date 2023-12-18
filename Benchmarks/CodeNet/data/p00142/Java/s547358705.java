import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Set<Integer> set = new HashSet<Integer>();
			
			for(int i = 1; i < n; i++){
				set.add((i*i) % n);
			}
			
			int[] count = new int[(n-1/2)];
			final int elems = set.size();
			final Integer[] array = set.toArray(new Integer[0]);
			
			for(int i = 0; i < elems; i++){
				for(int j = 0; j < elems; j++){
					if(i == j){
						continue;
					}
					
					int tmp = array[i] - array[j];
					if(tmp < 0){
						tmp += n;
					}
					if(tmp > (n-1)/2){
						tmp = n - tmp;
					}
					
					count[tmp-1]++;
				}
			}
			
			for(int i = 0; i < (n-1)/2; i++){
				System.out.println(count[i]);
			}
		}
		
	}
	
}