import java.util.*;   
import java.lang.*;   
import java.math.*;   
import java.io.*; 

public class Main {
	
	Scanner sc;
	
	LinkedList<Integer> list;
	
	void run() {
		sc = new Scanner(System.in);
		list = new LinkedList<Integer>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			if (a != 0)
				list.add(a);
			else System.out.println(list.removeLast());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	
}