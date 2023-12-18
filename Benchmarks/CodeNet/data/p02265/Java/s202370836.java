import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cell {
	int data;
	Cell next;
	Cell prev;

	Cell(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class DLList {
	final Cell header;
	Cell cell;

	DLList() {
		header = new Cell(-1);
	}
	void insert(int x) {
		Cell c = new Cell(x);
		header.next.prev = c;
		c.next = header.next;
		header.next = c;
		c.prev = header;
	}
	Cell search(int x) {
		Cell c = header;
		while(c.data != x) {
			c = c.next;
		}
		return c;
	}
	void delete(int x) {
		Cell c = search(x);
		c.prev.next = c.next;
		c.next.prev = c.prev;
		c = null;
	}
	void deleteFirst() {
		Cell c = header.next;
		header.next = c.next;
		c.next.prev = header;
		c = null;
	}
	void deleteLast() {
		Cell c = header.prev;
		c.prev.next = header;
		header.prev = c.prev;
		c = null;
	}
}

//双方向連結リスト
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DLList list = new DLList();
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++) {
				String[] str = br.readLine().split(" ");
				if(str[0].startsWith("i")) {
					list.insert(a);
					int a = Integer.parseInt(str[1]);
				} else if(str[0].equals("deleteFirst")) {
					list.deleteFirst();
				} else if(str[0].equals("deleteLast")) {
					list.deleteLast();
				} else {
					list.delete(a);
					int a = Integer.parseInt(str[1]);
				}
			}
			for(Cell c = list.header.next; c == list.header.prev; c = c.next) {
				if(c.next == list.header) {
					System.out.println(c.data);
				} else {
					System.out.print(c.data + " ");
				}
			}
		} catch(IOException e) {
			System.out.println("error");
		} finally {
			try {
				br.close();
			} catch(IOException e) {

			}
		}
	}

}

