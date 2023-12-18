import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			ArrayList<Integer> array = new ArrayList<Integer>(k);
			
			boolean white = false;
			for(int i = 0; i < k; i++){
				final int in = sc.nextInt();
				
				if(in == 0){
					white = true;
				}else{
					array.add(in);
				}
			}
			
			Collections.sort(array);
			
			int cur_len = 1;
			int connected_len = 1;
			int max = 1;
			for(int i = 1; i < array.size(); i++){
				//System.out.println(array.get(i) + " <-> " + array.get(i-1) + " => " +cur_len + " " + connected_len);
				
				if(array.get(i) - array.get(i-1) == 1){
					cur_len++;
					if(white){
						connected_len++;
					}
				}else if(array.get(i) - array.get(i-1) == 2){
					if(white){
						max = Math.max(connected_len, max);
						connected_len = cur_len + 2;
					}else{
						max = Math.max(cur_len, max);
					}
					cur_len = 1;
				}else{
					if(white){
						max = Math.max(connected_len, max);
						connected_len = 1;
					}else{
						max = Math.max(cur_len, max);
					}
					cur_len = 1;
				}
			}
			
			if(white){
				max = Math.max(connected_len, max);
			}else{
				max = Math.max(cur_len, max);
			}
			
			System.out.println(max);
		}

	}

}