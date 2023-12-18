import java.util.HashMap;
import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		Counter<Character> c = new Counter<>(26);
		for(char i='a';i<='z';i++)
			c.add(i,0);
		for(char i:s.nextLine().toLowerCase().replaceAll("[^a-z]","").toCharArray())
			c.add(i);
		c.map.forEach((k,v)->System.out.printf("%c : %d\n",k,v));
	}
}
class Counter<T> {
	public HashMap<T, Integer> map;
	public Counter(int initSize) {
		map = new HashMap<>(initSize);
	}
	public Counter() {
		this(10);
	}
	public void add(T key, int v) {
		Integer i;
		if((i=map.get(key))==null) {
			map.put(key, v);
		}else {
			map.put(key, i+v);
		}
	}
	public void add(T key) {
		add(key,1);
	}
}