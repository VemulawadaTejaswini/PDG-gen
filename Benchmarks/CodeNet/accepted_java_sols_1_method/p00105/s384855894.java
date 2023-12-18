import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashMap<String, PriorityQueue<Integer>> map = new HashMap<String,PriorityQueue<Integer>>();
		PriorityQueue<String> strs = new PriorityQueue<String>();
		while(cin.hasNext()){
			String str = cin.next();
			int  v = cin.nextInt();
			if(map.containsKey(str)){
				PriorityQueue<Integer> q = map.remove(str);
				q.add(v);
				map.put(str, q);
			}
			else{
				PriorityQueue<Integer> q = new PriorityQueue<Integer>();
				q.add(v);
				map.put(str, q);
				strs.add(str);
			}
		}
		while(!strs.isEmpty()){
			String s = strs.poll();
			PriorityQueue<Integer> ints = map.get(s);
			System.out.println(s);
			while(!ints.isEmpty()){
				System.out.print(ints.poll());
				if(ints.isEmpty()){
					System.out.println();
					break;
				}
				System.out.print(" ");
			}
		}
	}

}