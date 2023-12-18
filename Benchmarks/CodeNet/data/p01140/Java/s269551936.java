import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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
			
			ArrayList<Integer> h_list = new ArrayList<Integer>();
			ArrayList<Integer> w_list = new ArrayList<Integer>();
			
			for(int len = 1; len <= h_array.length; len++){
				int sum = 0;
				for(int t = 0; t < len; t++){
					sum += h_array[t];
				}
				
				h_list.add(sum);
				
				for(int in = len; in < h_array.length; in++){
					sum += h_array[in];
					sum -= h_array[in - len];
					
					h_list.add(sum);
				}
			}
			
			for(int len = 1; len <= w_array.length; len++){
				int sum = 0;
				for(int t = 0; t < len; t++){
					sum += w_array[t];
				}
				
				w_list.add(sum);
				
				for(int in = len; in < w_array.length; in++){
					sum += w_array[in];
					sum -= w_array[in - len];
					
					w_list.add(sum);
				}
			}
			
			//System.out.println(h_list);
			
			Collections.sort(h_list);
			Collections.sort(w_list);
			
			int count = 0;
			for(int h : h_list){
				for(int w : w_list){
					if(h == w){
						count++;
					}else if(h < w){
						break;
					}
				}
			}
			
			System.out.println(count);
		}
	}

}