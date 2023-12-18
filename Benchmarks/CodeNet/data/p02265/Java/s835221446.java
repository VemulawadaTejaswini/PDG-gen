
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int cnt = 0;
    	List l = new List();
    	for(int i = 0; i < n; i++){
    		String line = scan.next();
    		switch(line){
    		case "insert":
    			l.insertx(scan.nextInt(), cnt);
    			cnt++;
    			break;
    		case "delete":
    			l.deletex(scan.nextInt(), cnt);
    			cnt--;
    			break;
    		case "deleteFirst":
    			l.deleteFirst();
    			break;
    		case "deleteLast":
    			l.deleteLast(cnt);
    			break;
    		}
    	}
    	System.out.println(l);
    }
}

class List{
	private Cell head;
	public List(){
		head = new Cell(0, head, head);
	}
	public void insertx(int data, int cnt){
		if(cnt == 0){
			Cell c = new Cell(data, null, head);
			head.setNext(c);
		}else{
			Cell c = new Cell(data, head.getNext(), head);
			head.getNext().setPrev(c);
			head.setNext(c);
		}
	}
	public void deletex(int data, int cnt){
		Cell c = head;
		for(int i = 0; i < cnt-1; i++){
			c = c.getNext();
			if(c.getData() == data){
				if(i == cnt - 1){
					c.getPrev().setNext(null);
				}else{
					c.getPrev().setNext(c.getNext());
					c.getNext().setPrev(c.getPrev());
				}
				break;
			}
		}
	}
	public void deleteFirst(){
		Cell c = head.getNext();
		head.setNext(c.getNext());
		c.getNext().setPrev(head);
	}
	public void deleteLast(int cnt){
		Cell c = head;
		for(int i = 0; i < cnt-1; i++){
			c = c.getNext();
		}
		//System.out.println(c.getData());
		c.getPrev().setNext(null);
	}
	public String toString(){
		Cell c = head.getNext();
		String str = String.valueOf(c.getData());
		while(c.getNext() != null){
			c = c.getNext();
			str = str + " " + c.getData();
		}
		return str;
	}
}
class Cell{
	private int data;
	private Cell next;
	private Cell prev;
	
	public Cell(int data, Cell next, Cell prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	public Cell getNext(){
		return next;
	}
	public Cell getPrev(){
		return prev;
	}
	public int getData(){
		return data;
	}
	public void setNext(Cell next){
		this.next = next;
	}
	public void setPrev(Cell prev){
		this.prev = prev;
	}
	public void setData(int data){
		this.data = data;
	}
}

