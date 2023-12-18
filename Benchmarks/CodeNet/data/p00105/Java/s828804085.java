import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

//Book Index
public class Main{

	public static class B implements Comparable<B>{
		public String s;
		public PriorityQueue<Integer> q;
		public B(String s) {
			this.s = s;
			q = new PriorityQueue<Integer>();
		}
		public int compareTo(B o) {
			return s.compareTo(o.s);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<B> list = new ArrayList<B>();
		Map<String, Integer> ref = new HashMap<String, Integer>();
		int id = 0;
		while(sc.hasNext()){
			String s = sc.next();
			if(ref.containsKey(s))list.get(ref.get(s)).q.add(sc.nextInt());
			else {
				B b = new B(s);
				b.q.add(sc.nextInt());
				list.add(b);
				ref.put(s, id++);
			}
		}
		Collections.sort(list);
		for(B b:list){
			System.out.println(b.s);
			boolean f = true;
			for(int a:b.q){
				if(!f)System.out.print(" ");
				f = false;
				System.out.print(a);
			}
			System.out.println();
		}
	}
}