
import java.util.Scanner;

class Link{
	int x;
	Link next;
	Link previous;
	public Link(int x){
		this.x = x;
	}
}

class DoublyLinkedList{
	Link first;
	Link last;
	public DoublyLinkedList(){
		first = null;
		last = null;
	}
	public boolean isEmpty(){
		return (first ==null);
	}
	public void insert(int x){
		Link newLink = new Link(x);
		if(isEmpty()){
			last = newLink;
		}else{
			newLink.next = first;
			first.previous = newLink;
		}
		first = newLink;
	}
	public Link delete(int x){
		Link current  = first;
		while(current.x != x){
			current = current.next;
			if(current == null)
				return null;
		}
		//?????????????????????????????????
		if(current == first){
			first = current.next;
		}else{
			current.previous.next = current.next;
		}
		if(current==last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		
		return current;
	}
	public Link deleteFirst(){
		Link temp = first;
		if(first.next == null)
			first = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}
	public Link deleteLast(){
		Link temp = last;
		if(first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		DoublyLinkedList dll = new DoublyLinkedList();
		
		for(int i = 0;i<n;i++){
			String order = in.next();
			if(order == "insert"){
				int x = in.nextInt();
				dll.insert(x);
			}else if(order == "delete"){
				int x = in.nextInt();
				dll.delete(x);
			}else if(order == "deleteFirst"){
				dll.deleteFirst();
			}else if(order == "deleteLast"){
				dll.deleteLast();
			}
		}
	}
}