import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cell {
	Cell next;
	Cell prev;
	int data;

	public Cell(int data) {
		this.data = data;
	}
}

class DoubleLinkedList {
	Cell senti;

	public DoubleLinkedList() {
		Cell cell = new Cell(-1);
		this.senti = cell;
		senti.next = senti;
		senti.prev = senti;
	}
	public void insert(int data) {
		Cell cell = new Cell(data);
		senti.next.prev = cell;
		cell.next = senti.next;
		senti.next = cell;
		cell.prev = senti;
	}
	public Cell search(int data) {
		Cell cell = senti.next;
		while(cell != senti) {
			if(cell.data == data) {
				return cell;
			}
			cell = cell.next;
		}
		return senti;
	}
	public void delete(int data) {
		Cell cell = search(data);
		if(cell != senti) {
			cell.prev.next = cell.next;
			cell.next.prev = cell.prev;
		}
	}
	public void deleteFirst() {
		senti.next.next.prev = senti;
		senti.next = senti.next.next;
	}
	public void deleteLast() {
		senti.prev.prev.next = senti;
		senti.prev = senti.prev.prev;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		DoubleLinkedList linkedList = new DoubleLinkedList();
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split("");
			if(s[0].equals("insert")) {
				int a = Integer.parseInt(s[1]);
				linkedList.insert(a);
			} else if (s[0].equals("delete")) {
				int a = Integer.parseInt(s[1]);
				linkedList.delete(a);
			} else if (s[0].equals("deleteFirst")) {
				linkedList.deleteFirst();
			} else {
				linkedList.deleteLast();
			}
		}
		for(Cell cell = linkedList.senti.next; cell != linkedList.senti; cell = cell.next) {
			if(cell.next == linkedList.senti) {
				System.out.println(cell.data);
			} else {
				System.out.print(cell.data + " ");
			}
		}
	}
}
