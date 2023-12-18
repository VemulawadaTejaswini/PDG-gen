import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Node {
		int value;
		Node prev;
		Node next;
		
		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
	
	static class MyList {
		Node start;
		Node end;
		
		public void insert(int num) {
			Node tmp = new Node(num, end.prev, end);
			end.prev.next = tmp;
			end.prev = tmp;
		}
		
		public StringBuilder print() {
			Node tmp = start.next;
			StringBuilder sb = new StringBuilder();
			while (tmp != end) {
				sb.append(tmp.value);
				sb.append(' ');
				tmp = tmp.next;
			}
			
			return sb;
		}
		
		public void splice(MyList myList) {
			this.end.prev.next = myList.start.next;
			myList.start.next.prev = this.end.prev;
			this.end = myList.end;
		}
		
		public MyList() {
			start = new Node(-1000000001, null, null);
			end = new Node(-1000000001, start, start);
			start.next = end;
			start.prev = end;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		List<MyList> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new MyList());
		}
		for (int i = 0; i < q; i++) {
			switch (sc.nextInt()) {
				case 0:
					list.get(sc.nextInt()).insert(sc.nextInt());
					break;
				case 1:
					String str = list.get(sc.nextInt()).print().toString();
					if (str.length() <= 0) {
						System.out.println();
					} else {
						System.out.println(str.substring(0, str.length() - 1));
					}
					break;
				case 2:
					int s = sc.nextInt();
					int t = sc.nextInt();
					list.get(t).splice(list.get(s));
					list.set(s, new MyList());
					break;
			}
		}
	}
}

