import java.util.*;

class el {

	private int key;
	private el prev;
	private el next;

	el(int key,el prev,el next){
		this.key = key;
		this.prev = prev;
		this.next = next;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public el getPrev() {
		return prev;
	}
	public void setPrev(el prev) {
		this.prev = prev;
	}
	public el getNext() {
		return next;
	}
	public void setNext(el next) {
		this.next = next;
	}
}

class ChainedList {
	private el head;
	private el end;
	private int size = 0;

	ChainedList(){
		el dummy = new el(0,null,null);
		dummy.setPrev(dummy);
		dummy.setNext(dummy);
		this.head = dummy;
		this.end = dummy;
	}
	
	void insert(int x){
		el e = new el(x,this.head,this.head.getNext());
		this.head.getNext().setPrev(e);
		this.head.setNext(e);
		this.size++;
	}

	boolean delete(int x){
		el e = this.head.getNext();
		for(int i = 0;i < this.size;i++,e = e.getNext()){
			if(e.getKey() == x) {
				e.getPrev().setNext(e.getNext());
				e.getNext().setPrev(e.getPrev());
				this.size--;
				return true;
			}
		}
		return false;
	}

	boolean deleteFirst(){
		if(0 < this.size){
			el n = this.head.getNext().getNext();
			n.setPrev(this.head);
			this.head.setNext(n);
			this.size--;
			return true;
		}
		return false;
	}
	
	boolean deleteLast(){
		if(0 < this.size){
			el p = this.end.getPrev().getPrev();
			p.setNext(this.end);
			this.end.setPrev(p);
			this.size--;
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}
	
	public void printList(){
		el e = this.head.getNext();
		for (int i = 0; i < this.size; i++) {
			System.out.print(e.getKey());
			e = e.getNext();
			if (i < this.size - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ChainedList l = new ChainedList();

		for(int i = 0;i < n; i++){
			String s = sc.next();
			if(s.equals("insert")){
				l.insert(sc.nextInt());
			} else if(s.equals("delete")){
				l.delete(sc.nextInt());
			} else if (s.equals("deleteFirst")){
				l.deleteFirst();
			} else if (s.equals("deleteLast")){
				l.deleteLast();
			}
		}
		l.printList();
	}
}