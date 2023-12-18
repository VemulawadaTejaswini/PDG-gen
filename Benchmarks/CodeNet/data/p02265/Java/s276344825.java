import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cell {
	int data;
	Cell next;
	Cell prev;

	Cell(int data) {
		this.data = data;
	}
}

class DLList {
	final Cell header;

	DLList() {
		header = new Cell(-1);
		header.next = header;
		header.prev = header;
	}
	void insert(int x) {
		Cell c = new Cell(x);
		if(header.next == header) {
			c.next = header;
			c.prev = header;
			header.next = c;
			header.prev = c;
		} else {
			Cell d = header.next;
			c.next = d;
			c.prev = header;
			header.next = c;
			d.prev = c;
		}
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
					int a = Integer.parseInt(str[1]);
					list.insert(a);
				} else if(str[0].equals("deleteFirst")) {
					list.deleteFirst();
				} else if(str[0].equals("deleteLast")) {
					list.deleteLast();
				} else {
					int a = Integer.parseInt(str[1]);
					list.delete(a);
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

