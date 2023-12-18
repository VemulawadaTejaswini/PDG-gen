import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	Deque<Integer> List = new ArrayDeque<Integer>();
	
	int n;
	String order;
	
	public void input() {
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			order = sc.next();
			
			if( order.equals("insert") ) {
				List.addFirst(sc.nextInt());
				
			}else if( order.equals("delete") ) {
				List.remove(sc.nextInt());
			}
			
			else if( order.equals("deleteFirst") ) {List.removeFirst();}
			else{List.removeLast();}
		}
	}
	
	public void output() {
		boolean tex = true;
		for(int ans : List) {
			System.out.print((tex ? "" : " ") + ans);
			if(tex) tex = false;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

