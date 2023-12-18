import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	class index implements Comparable<index> {
		String key = "";
		LinkedList<Integer> p = new LinkedList<Integer>();
		@Override
		public int compareTo(index o) {
			return this.key.compareTo(o.key);
		}
		@Override
		public String toString() {
			String ret = key+"\n";
			Integer m[] = null;
			m=p.toArray(new Integer[0]);
			Arrays.sort(m);
			String r2 = "";
			for(int a :m){
				r2 += " "+a;
			}
			ret+=r2.trim();
			return ret;
		}
		@Override
		public boolean equals(Object obj) {
			return this.key.equals(((index)obj).key);
		}
	}
	
	void run(){
		LinkedList<index> map = new LinkedList<Main.index>();
		for(;sc.hasNext();){
			String w = sc.next();
			int p = sc.nextInt();
			index o = new index();
			o.key = w;
			o.p.add(p);
			int i = map.indexOf(o);
			if(i == -1){
				map.add(o);
			}else{
				map.get(i).p.add(p);
			}
		}
		index[] s  = map.toArray(new index[0]);
		Arrays.sort(s);
		for(int  i= 0; i < s.length;i++){
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}