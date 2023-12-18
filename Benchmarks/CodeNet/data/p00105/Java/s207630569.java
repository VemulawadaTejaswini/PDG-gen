import java.util.*;
import java.util.Map.Entry;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Map<String, PriorityQueue<Integer>> index = new TreeMap<String, PriorityQueue<Integer>>();
		int page;
		String word;
		while(sc.hasNext()) {
			word = sc.next(); page = sc.nextInt();
			if(index.containsKey(word)) {
				index.get(word).offer(page);
			} else {
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
				pq.offer(page);
				index.put(word, pq);
			}
		}
		
		for(Entry<String, PriorityQueue<Integer>> entry : index.entrySet()) {
			System.out.println(entry.getKey());
			PriorityQueue<Integer> pq = entry.getValue();
			while(!pq.isEmpty()) {
				if(pq.size() == 1) {
					System.out.println(pq.poll());
				} else {
					System.out.print(pq.poll() +  " ");
				}
			}
		}
		
	}

}