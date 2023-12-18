import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		mylist ls=new mylist();
		int n=Integer.parseInt(in.next());
		for(int i=0;i<n;i++)ls.insert(Integer.parseInt(in.next()));
		ls.unique();
		ls.printls();
		
	}

}

class node{
	int v;
	node prev,next;
}

class mylist{
	node END,NOW;
	int size;
	
	mylist(){
		END=new node();
		END.prev=END;
		END.next=END;
		size=0;
	}
	
	void insert(int n) {
		node NEW=new node();
		NEW.v=n;
		NEW.next=END;
		NEW.prev=END.prev;
		NEW.prev.next=NEW;
		END.prev=NEW;
		size++;
	}
	
	private void pdelete(node N) {
		NOW.next.prev=NOW.prev;
		NOW.prev.next=NOW.next;
	}
	
	void unique() {
		NOW=END.next;
		int n=NOW.v,dsize=0;
		NOW=NOW.next;
		for(int i=1;i<size;i++) {
			if(NOW.v==n) {
				pdelete(NOW);
				dsize++;
			}
			else n=NOW.v;
			NOW=NOW.next;
		}
		size-=dsize;
	}
	
	void printls() {
		NOW=END.next;
		for(int i=0;i<size-1;i++) {
			System.out.print(NOW.v+" ");
			NOW=NOW.next;
		}
		System.out.println(NOW.v);
	}
}
