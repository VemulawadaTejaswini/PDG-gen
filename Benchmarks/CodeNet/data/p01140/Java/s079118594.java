import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.gc();
			
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			if(N == 0 && M == 0){
				break;
			}
			
			int[] h_array = new int[N];
			int[] w_array = new int[M];
			
			for(int i = 0; i < N; i++){
				h_array[i] = sc.nextInt();
			}
			
			for(int i = 0; i < M; i++){
				w_array[i] = sc.nextInt();
			}
			
			 int[] h_map = new int[1500001];
			 int[] w_map = new int[1500001];
			
			for(int len = 1; len <= h_array.length; len++){
				int sum = 0;
				for(int t = 0; t < len; t++){
					sum += h_array[t];
				}
				
				h_map[sum]++;
				
				for(int in = len; in < h_array.length; in++){
					sum += h_array[in];
					sum -= h_array[in - len];
					
					h_map[sum]++;
				}
			}
			
			for(int len = 1; len <= w_array.length; len++){
				int sum = 0;
				for(int t = 0; t < len; t++){
					sum += w_array[t];
				}
				
				w_map[sum]++;
				
				for(int in = len; in < w_array.length; in++){
					sum += w_array[in];
					sum -= w_array[in - len];
					
					w_map[sum]++;
				}
			}
			
			
			int count = 0;
			for(int h = 0; h < h_map.length; h++){
				if(h_map[h] == 0){
					continue;
				}else if(w_map[h] == 0){
					continue;
				}else{
					count += h_map[h] * w_map[h];
				}
			}
			
			System.out.println(count);
		}
	}

}