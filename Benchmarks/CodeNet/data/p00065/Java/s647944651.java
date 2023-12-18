
import java.util.*;
import java.lang.*;
import java.math.*;

import javax.swing.RowFilter.Entry;

public class Main {
	Scanner sc = new Scanner(System.in);
	class log implements Comparable<log>{
		int key;
		int value;
		log(int key,int value){
			this.key = key;
			this.value = value;
		}
		@Override
		public int compareTo(log o) {
			return key-o.key;
		}		
	}
	
	void run(){
		HashMap<Integer, Integer> l = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> l2 = new HashMap<Integer, Integer>();
		for(;;){
			String buffer = sc.nextLine();
			if(buffer.length() == 0) break;
			int k = new Scanner(buffer.replace(',', ' ')).nextInt();
			if(l.containsKey(k)){
				l.put(k, l.get(k)+1);
			}else{
				l.put(k, 1);
			}
		}
		for(;sc.hasNextLine();){
			String buffer = sc.nextLine();
//			if(buffer.equals("ddd")) break;
			int k = new Scanner(buffer.replace(',', ' ')).nextInt();
			if(l2.containsKey(k)){
				l2.put(k, l2.get(k)+1);
			}else{
				l2.put(k, 1);
			}
		}
		LinkedList<log> l3 = new LinkedList<Main.log>();
		for(int i:l.keySet()){
			if(l2.containsKey(i)){
				l3.add(new log(i, l.get(i)+l2.get(i)));
			}
		}
		log[] arr = l3.toArray(new log[0]);
		Arrays.sort(arr);
		for(log ans:arr){
			System.out.println(ans.key + " " + ans.value);
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}