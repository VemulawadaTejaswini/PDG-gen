import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		boolean[] is_prime = new boolean[200001];
		final int end = (int) Math.ceil(Math.sqrt(200000));
		
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		
		for(int i = 0; i <= end; i++){
			if(is_prime[i]){
				for(int j = 2 * i; j <= 200000; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		ArrayList<Integer> p_list = new ArrayList<Integer>();
		for(int i = 0; i <= 200000; i++){
			if(is_prime[i]){
				p_list.add(i);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(10000);
		while(true){
			final int N = sc.nextInt();
			final int P = sc.nextInt();
			
			if(N == -1 && P == -1){
				break;
			}
			
			list.clear();
			
			int start = Collections.binarySearch(p_list, N);
			if(start < 0){
				start = -(start + 1);
			}else{
				start++;
			}
			
			
			for(int i = 0; i < P; i++){
				for(int j = i; j < P; j++){
					list.add(p_list.get(start + i) + p_list.get(start + j));
				}
			}
			
			Collections.sort(list);
			System.out.println(list.get(P-1));
		}
	}

}