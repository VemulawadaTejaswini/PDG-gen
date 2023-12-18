import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] x_array = new int[n + 1];
			int[] y_array = new int[n + 1];
			
			x_array[0] = 0;
			y_array[0] = 0;
			
			for(int i = 1; i <= n; i++){
				x_array[i] = sc.nextInt();
				y_array[i] = sc.nextInt();
			}
			
			boolean[] visited = new boolean[n+1];
			
			int cur_place = 0;
			double sum_dist = 0;
			double cur_angle = Math.PI / 2;
			for(int run = 0; run < n; run++){
				visited[cur_place] = true;
				
				//System.out.println(cur_place);
				
				int next_place = -1;
				double min_angle = Math.PI * 2;
				double min_dist = 0;
				
				for(int next = 0; next < n + 1; next++){
					if(visited[next]){
						continue;
					}
					
					double d = Math.sqrt((x_array[cur_place] - x_array[next]) * (x_array[cur_place] - x_array[next]) +
							(y_array[cur_place] - y_array[next]) * (y_array[cur_place] - y_array[next]));
					double a = Math.atan2(y_array[next] - y_array[cur_place], x_array[next] - x_array[cur_place]);
					
					double diff_a = cur_angle - a;
					if(diff_a < 0){
						diff_a += Math.PI * 2;
					}
					
					if(min_angle >= diff_a){
						if(min_angle > diff_a){
							min_dist = d;
							min_angle = diff_a;
							next_place = next;
						}else if(min_dist > d){
							min_dist = d;
							next_place = next;
						}
					}
				}
				
				cur_angle = Math.atan2(y_array[next_place] - y_array[cur_place], x_array[next_place] - x_array[cur_place]);
				cur_place = next_place;
				sum_dist += min_dist;
			}
			
			
			System.out.printf("%.1f\n", sum_dist);
		}

	}

}