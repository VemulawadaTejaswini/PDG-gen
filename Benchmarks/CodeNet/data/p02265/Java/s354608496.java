import java.io.PrintWriter;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		DLinkedList list=new DLinkedList();
		for(int i=0;i<n;i++) {
			String str=cin.next();
			if(str.equals("insert")) {
				int x=Integer.parseInt(cin.next());
				list.insert(x);
			}
			else if(str.equals("delete")) {
				int x=Integer.parseInt(cin.next());
				list.deleteFact(x);
			}
			else if(str.equals("deleteFirst"))list.deleteFirst();
			else if(str.equals("deleteLast"))list.deleteLast();
			//System.out.println(i);
		}
		
		PrintWriter out=new PrintWriter(System.out);
		
		int lim=list.size();
		Cell c=list.dummy.getNext();
		for(int i=0;i<lim;i++) {
			if(i==lim-1)out.println(c.data);
			else out.print(c.data+" ");
			c=c.getNext();
		}
		out.flush();
	}

}

class Cell{
	int data=-1;
	Cell next;
	Cell prev;
	
	Cell(int x){
		data=x;
	}
	
	void setNext(Cell next) {
		this.next=next;
	}
	
	Cell getNext() {
		return next;
	}
	
	void setPrev(Cell prev) {
		this.prev=prev;
	}
	
	Cell getPrev() {
		return prev;
	}
	
	int getData() {
		return data;
	}
}

class DLinkedList{
	Cell dummy;
	int size;
	
	DLinkedList(){
		dummy=new Cell(-1);
		dummy.setNext(dummy);
		dummy.setPrev(dummy);
		size=0;
	}
	
	void insert(int data) {
		Cell c=new Cell(data);
		c.setNext(dummy.getNext());
		c.setPrev(dummy);
		dummy.getNext().setPrev(c);
		dummy.setNext(c);
		size++;
	}
	
	void deleteFirst() {
		Cell c=dummy.getNext();
		if(c==dummy)return;
		c.getNext().setPrev(c.prev);
		c.getPrev().setNext(c.getNext());
		size--;
	}
	
	void deleteLast() {
		Cell c=dummy.getPrev();
		if(c==dummy)return;
		c.getNext().setPrev(c.getPrev());
		c.getPrev().setNext(c.getNext());
		size--;
	}
	
	boolean deleteFact(int x) {
		Cell c=dummy.getNext();
		for(int i=0;i<size;i++) {
			if(c.getData()==x) {
				c.getNext().setPrev(c.getPrev());
				c.getPrev().setNext(c.getNext());
				size--;
				return true;
			}
			c=c.getNext();
		}
		return false;
	}
	
	int size() {
		return size;
	}
}
