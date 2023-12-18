import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		PriorityQueue<Long> queue = new PriorityQueue<Long>(n, Collections.reverseOrder());
		
		for(int i = 0; i < n; i++){
			queue.add(sc.nextLong());
		}
		
		int loss = 0;
		int count = 0;
		long sum = 1;
		while(!queue.isEmpty()){
			final long hp = queue.poll();
			sum += Math.max(0, hp - loss);
			count++;
			
			if(count >= 4){
				loss++;
				count = 0;
			}
		}
		
		System.out.println(sum);
		
	}

}