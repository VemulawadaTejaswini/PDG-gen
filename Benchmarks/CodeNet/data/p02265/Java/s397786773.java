import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Link{
	int x;
	Link next;
	Link previous;
	public Link(int x){
		this.x = x;
	}
	public void displayLink(){
		System.out.print(x);
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
	public void display(){
		Link temp = first;
		while(temp != null){
			temp.displayLink();
			temp = temp.next;
			if(temp != null){
				System.out.print(" ");
			}
		}
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		DoublyLinkedList dll = new DoublyLinkedList();
		
		for(int i = 0;i<n;i++){
			String order = br.readLine();
		
			if(order.charAt(0) == 'i'){
				dll.insert(Character.getNumericValue(order.charAt(7)));
			}else if(order.charAt(6) == 'F'){
				dll.deleteFirst();
			}else if(order.charAt(6) == 'L'){
				dll.deleteLast();
			}else{
				dll.delete(Character.getNumericValue(order.charAt(7)));
			}
		}
		dll.display();
		for(int i = 0;i<n;i++){
			String order = br.readLine();
		
			if(order.charAt(0) == 'i'){
				dll.insert(Character.getNumericValue(order.charAt(7)));
			}else if(order.charAt(6) == 'F'){
				dll.deleteFirst();
			}else if(order.charAt(6) == 'L'){
				dll.deleteLast();
			}else{
				dll.delete(Character.getNumericValue(order.charAt(7)));
			}
		}
		dll.display();
		System.out.println("");
	}
}