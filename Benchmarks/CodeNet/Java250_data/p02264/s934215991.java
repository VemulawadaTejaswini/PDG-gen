import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int q = sc.nextInt();
		
		LinkedList<String>  name_queue = new LinkedList<String>();
		LinkedList<Integer> time_queue = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++){
			name_queue.add(sc.next());
			time_queue.add(sc.nextInt());
		}
		
		int total_time = 0;
		while(!time_queue.isEmpty()){
			final String name = name_queue.poll();
			final int time = time_queue.poll();
			
			if(time > q){
				total_time += q;
				name_queue.add(name);
				time_queue.add(time - q);
			}else{
				total_time += time;
				System.out.println(name + " " + total_time);
			}
			
		}
		
		
		
	}
}