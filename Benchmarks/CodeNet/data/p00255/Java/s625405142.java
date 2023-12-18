import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			StringTokenizer input_n = new StringTokenizer(br.readLine());
			
			final int n = Integer.parseInt(input_n.nextToken());
			
			if(n == 0){
				break;
			}
			
			long sum = 0;
			StringTokenizer input_p = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++){
				sum += Integer.parseInt(input_p.nextToken());
			}
			
			PriorityQueue<Integer> joint_queue = new PriorityQueue<Integer>(n-1, Collections.reverseOrder());
			StringTokenizer input_j = new StringTokenizer(br.readLine());
			for(int i = 0; i < n - 1; i++){
				joint_queue.add(Integer.parseInt(input_j.nextToken()));
			}
			
			long max = n * sum;
			int cur_size = n;
			while(!joint_queue.isEmpty()){
				int joint = joint_queue.poll();
				sum += joint;
				cur_size -= 1;
				
				long cur = cur_size * sum;
				if(max > cur){
					break;
				}else{
					max = cur;
				}
			}
			
			System.out.println(max);
		}
	}

}