
import java.util.Scanner;

public class Main {
	
	static DLL nil = new DLL(-1);

	public static void init() {
		nil.setPrev(nil);
		nil.setNext(nil);
	}
	
	public static void insert(int key) {
		DLL node = new DLL(key);
		node.setNext(nil.getNext());
		node.setPrev(nil);
		nil.getNext().setPrev(node);
		nil.setNext(node);
	}
	
	public static DLL listSearch(int key) {
		DLL current = nil.getNext();
		while (!current.equals(nil)) {
			if (current.getValue()==key)
				return current;
			else
				current = current.getNext();				
		}
		return null;
	}
	
	public static void deleteNode(DLL node) {
		if (node == null) return;
		if (nil.equals(node)) return;
		node.getPrev().setNext(node.getNext());
		node.getNext().setPrev(node.getPrev());
		node = null;
	}
	
	public static void deleteFirst() {
		deleteNode(nil.getNext());
	}
	
	public static void deleteLast() {
		deleteNode(nil.getPrev());
	}
	
	public static void deletekey(int key) {
		deleteNode(listSearch(key));
	}
	
	public static void printList() {
		DLL current = nil.getNext();
		while (!current.equals(nil)) {
			if (current.getNext().equals(nil))
				System.out.println(current.getValue());
			else
				System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
	}
	
	public static void main(String[] args) {
		
		init();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for (int i=0; i<size; i++) {
			String ops = sc.next();
			if ("insert".equals(ops))
				insert(sc.nextInt());
			else if ("delete".equals(ops))
				deletekey(sc.nextInt());
			else if ("deleteFirst".equals(ops))
				deleteFirst();
			else if ("deleteLast".equals(ops))
				deleteLast();
			
		}
		sc.close();
		printList();
	}
	

}

class DLL {
	private int value;
	private DLL prev=null, next=null;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public DLL getPrev() {
		return prev;
	}
	public void setPrev(DLL prev) {
		this.prev = prev;
	}
	public DLL getNext() {
		return next;
	}
	public void setNext(DLL next) {
		this.next = next;
	}
	public DLL(int value, DLL prev, DLL next) {
		super();
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	public DLL() {
		super();
	}
	public DLL(int value) {
		this.value = value;
	}
	
}
