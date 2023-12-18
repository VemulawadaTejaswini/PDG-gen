import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		mylist ml=new mylist();
		int q=in.nextInt();
		for(int i=0;i<q;i++) {
			int query=Integer.parseInt(in.next());
			switch(query) {
			case 0:
				int x=Integer.parseInt(in.next());
				ml.insert(x);
				break;
				
			case 1:
				int d=Integer.parseInt(in.next());
				ml.move(d);
				break;
				
			case 2:
				ml.delete();
				break;
			}
		}
		ml.printls();
	}

}

class node{
	node next,prev;
	int n;
	boolean END=false;
}

class mylist{
	node END=new node();
	node currentNode;
	int position=0,size=0;
	
	mylist(){
		END=new node();
		END.END=true;
		END.next=END;
		END.prev=END;
		currentNode=END;
	}
	
	void insert(int x) {
		node nn=new node();
		nn.n=x;
		nn.next=currentNode;
		nn.prev=currentNode.prev;
		nn.prev.next=nn;
		nn.next.prev=nn;
		currentNode=nn;
		size++;
	}
	
	void move(int m) {
		for(int i=0;i<Math.abs(m);i++) {
			if(m<0)currentNode=currentNode.prev;
			else currentNode=currentNode.next;
		}
	}
	
	void delete() {
		currentNode.prev.next=currentNode.next;
		currentNode.next.prev=currentNode.prev;
		currentNode=currentNode.next;
		size--;
	}
	
	void printls() {
		node cn=END.next;
		for(int i=0;i<size;i++) {
			System.out.println(cn.n);
			cn=cn.next;
		}
	}
}

