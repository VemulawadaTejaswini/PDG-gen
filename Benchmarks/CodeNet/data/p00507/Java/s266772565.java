import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static class Conp{
		int start_pos, end_pos;
		boolean inv;

		public Conp(int s, int e) {
			super();
			this.start_pos = s;
			this.end_pos = e;
			inv = false;
		}
		
		public Conp(int s, int e, boolean inv) {
			super();
			this.start_pos = s;
			this.end_pos = e;
			this.inv = inv;
		}
		
		public int connect(int[] array){
			return Integer.parseInt(array[start_pos] + "" + array[end_pos]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		PriorityQueue<Integer> p_queue = new PriorityQueue<Integer>();
		
		Queue<Conp> queue = new LinkedList<Conp>();
		queue.add(new Conp(0, 1));
		
		int count = 0;
		while(!queue.isEmpty()){
			Conp conp = queue.poll();
			
			if(count > 1000){
				break;
			}else{
				count++;
			}
			
			p_queue.add(conp.connect(array));
			if(!conp.inv){
				if(conp.end_pos < array.length - 1 && conp.end_pos + 1 != conp.start_pos){
					queue.add(new Conp(conp.start_pos, conp.end_pos + 1));
				}
				if(conp.start_pos < array.length - 1 && conp.start_pos + 1 != conp.end_pos){
					queue.add(new Conp(conp.start_pos + 1, conp.end_pos));
				}
			
				queue.add(new Conp(conp.end_pos, conp.start_pos, true));
			}
		}
		
		//System.out.println(p_queue);
		
		p_queue.poll();
		p_queue.poll();
		System.out.println(p_queue.poll());
		
	}

}