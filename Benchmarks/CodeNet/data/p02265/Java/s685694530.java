import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	Deque<Integer> List = new ArrayDeque<Integer>();
	int n;
	String order;
	int data;
	int ans;
	public void input() {
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			order = sc.next();
			if( order.equals("insert") ) {
				data = sc.nextInt();
				List.addFirst(data);
			}else if( order.equals("delete") ) {
				data = sc.nextInt();
				List.remove(data);
			}
			else if( order.equals("deleteFirst") ) {List.removeFirst();}
			else{List.removeLast();}
		}
	}
	public void output() {
		while(true) {
			ans = List.poll();
			if(List.size() == 0) {
			    System.out.print(ans);
			    break;
			}else{
			    System.out.print(ans+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}
