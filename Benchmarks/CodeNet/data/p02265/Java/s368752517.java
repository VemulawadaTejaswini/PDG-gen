import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Deque<Integer> d = new ArrayDeque<Integer>();
	
	int n = sc.nextInt();
	for(int i = 0; i < n; ++i) {
		String com = sc.next();
		int a;
		switch(com) {
			case "insert":
				a = sc.nextInt();
				d.addFirst(a);
				break;
			case "delete":
				a = sc.nextInt();
				d.remove(a);
				break;
			case "deleteFirst":
				d.remove();
				break;
			case "deleteLast":
				d.removeLast();
				break;
		}
	}
	
	for(int i = 0; i < d.size(); ++i) {
		System.out.print(i == 0 ? d.poll() : " " + d.poll());
	}
	System.out.println();

  }
}