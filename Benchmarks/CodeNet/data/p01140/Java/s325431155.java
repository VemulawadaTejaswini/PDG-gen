import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			StringTokenizer tok = new StringTokenizer(br.readLine());
			
			final int N = Integer.parseInt(tok.nextToken());
			final int M = Integer.parseInt(tok.nextToken());
			
			if(N == 0 && M == 0){
				break;
			}
			
			int[] h_array = new int[N];
			int[] w_array = new int[M];
			
			for(int i = 0; i < N; i++){
				StringTokenizer in = new StringTokenizer(br.readLine());
				h_array[i] = Integer.parseInt(in.nextToken());
			}
			
			for(int i = 0; i < M; i++){
				StringTokenizer in = new StringTokenizer(br.readLine());
				w_array[i] = Integer.parseInt(in.nextToken());
			}
			
			Map<Integer, Integer> h_map = new HashMap<Integer, Integer>();
			Map<Integer, Integer> w_map = new HashMap<Integer, Integer>();
			
			for(int len = 1; len <= h_array.length; len++){
				int sum = 0;
				for(int t = 0; t < len; t++){
					sum += h_array[t];
				}
				
				if(h_map.get(sum) == null){
					h_map.put(sum, 1);
				}else{
					h_map.put(sum, h_map.get(sum) + 1);
				}
				
				for(int in = len; in < h_array.length; in++){
					sum += h_array[in];
					sum -= h_array[in - len];
					
					if(h_map.get(sum) == null){
						h_map.put(sum, 1);
					}else{
						h_map.put(sum, h_map.get(sum) + 1);
					}
				}
			}
			
			for(int len = 1; len <= w_array.length; len++){
				int sum = 0;
				for(int t = 0; t < len; t++){
					sum += w_array[t];
				}
				
				if(w_map.get(sum) == null){
					w_map.put(sum, 1);
				}else{
					w_map.put(sum, w_map.get(sum) + 1);
				}
				
				for(int in = len; in < w_array.length; in++){
					sum += w_array[in];
					sum -= w_array[in - len];
					
					if(w_map.get(sum) == null){
						w_map.put(sum, 1);
					}else{
						w_map.put(sum, w_map.get(sum) + 1);
					}
				}
			}
			
			
			int count = 0;
			for(int h : h_map.keySet()){
				if(w_map.get(h) != null){
					count += h_map.get(h) * w_map.get(h);
				}
			}
			
			System.out.println(count);
		}
	}

}