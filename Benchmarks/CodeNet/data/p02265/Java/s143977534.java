import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cell {
	private int data;
	private Cell next;
	private Cell prev;

	public Cell(int data) {
		this.data = data;
	}
	public void setNext(Cell next) {
		this.next = next;
	}
	public Cell getNext() {
		return this.next;
	}
	public void setPrev(Cell prev) {
		this.prev = prev;
	}
	public Cell getPrev() {
		return this.prev;
	}
	public int getData() {
		return this.data;
	}
}

class DLinkedList {
	private Cell dummy;

	public DLinkedList() {
		Cell c = new Cell(0);
		c.setNext(this.dummy);
		c.setPrev(this.dummy);
	}
	public Cell getDummy() {
		return this.dummy;
	}
	public void insert(int data) {
		Cell c = new Cell(data);
		c.setPrev(this.dummy);
		c.setNext(this.dummy.getNext());
		this.dummy.getNext().setPrev(c);
		this.dummy.setNext(c);

	}
	public Cell search(int data) {
		Cell c = this.dummy.getNext();
		int a = c.getData();
		while(a != data) {
			c = c.getNext();
			a = c.getData();
			if(c == this.dummy) {
				break;
			}
		}
		return c;
	}
	public void delete(int data) {
		Cell c = search(data);
		c.getNext().setPrev(c.getPrev());
		c.getPrev().setNext(c.getNext());
	}
	public void deleteFirst() {
		Cell c = this.dummy.getNext();
		this.dummy.setNext(c.getNext());
		c.getNext().setPrev(this.dummy);
	}
	public void deleteLast() {
		Cell c = this.dummy.getPrev();
		c.getPrev().setNext(this.dummy);
		this.dummy.setPrev(c.getPrev());
	}
	public void output() {
		for(Cell c = this.dummy.getNext(); c != this.dummy; c = c.getNext()) {
			if(c.getNext() == this.dummy) {
				System.out.println(c.getData());
			} else {
				System.out.print(c.getData() + " ");
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] arr = new String[2];
		int num;

		DLinkedList list = new DLinkedList();
		try {
			int n = Integer.parseInt(reader.readLine());
			num = -1;

			for(int i = 0; i < n; i++) {
				str = reader.readLine();
				if(str.charAt(0) == 'i') {
					arr = str.split(" ");
					num = Integer.parseInt(arr[1]);
					list.insert(num);
				} else if(str.charAt(6) == 'F') {
					list.deleteFirst();
				} else if(str.charAt(6) == 'L') {
					list.deleteLast();
				} else {
					arr = str.split(" ");
					num = Integer.parseInt(arr[1]);
					list.delete(num);
				}
			}
			list.output();
		} catch(IOException e) {
			;
		}
	}
}
