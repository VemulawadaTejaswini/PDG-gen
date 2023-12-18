import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static int MAX = 10000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> primes = new LinkedList<Integer>();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> quad = new ArrayList<Integer>();
		
		for(int i = 2; i <= MAX; i++){
			boolean is_prime = true;
			int sqrt = (int)(Math.sqrt(i) + 0.5);
			
			for(int prime : primes){
				if(prime > sqrt){
					break;
				}else if(i % prime == 0){
					is_prime = false;
					break;
				}
			}
			
			if(!is_prime){
				continue;
			}
			
			primes.add(i);
			
			queue.add(i);
			if(queue.size() > 4){
				queue.remove();
			}
			
			if(queue.size() == 4){
				//System.out.println(queue);
				boolean flag = true;
				
				int before = queue.peek();
				int count = 0;
				for(ListIterator<Integer> iter = queue.listIterator(1); iter.hasNext(); ){
					int next = iter.next();
					if(next - before != (count == 1 ? 4 : 2)){
						flag = false;
						break;
					}
					before = next;
					count++;
				}
				
				if(flag){
					quad.add(queue.getLast());
				}
			}
		}
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int pos = Collections.binarySearch(quad, n);
			if(pos < 0){
				pos = -pos;
				pos -= 2;
			}
			
			System.out.println(quad.get(pos));
		}
	}

}