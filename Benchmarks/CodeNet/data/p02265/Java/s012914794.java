import java.util.Scanner;
class Node{
	Node prev;
	Node next;
	String n;
	Node(){
		prev=this;
		next=this;
	}
	Node(Node prev,Node next,String data){
		n=data;
		this.prev=prev;
		this.next=next;
	}
}
public class Main {
	static Node head=new Node();
	static Node crnt=head;
	
	static void add(String x){
		Node tmp=new Node(crnt,crnt.next,x);
		crnt.next=crnt.next.prev=tmp;
		crnt=tmp;
	}
	
	static void insert(String x){
		crnt=head;
		add(x);
	}
	
	static boolean isEmpty(){
		return head.next==head;
	}
	
	static void removeCurrentNode(){
		if(!isEmpty()){
			crnt.prev.next=crnt.next;
			crnt.next.prev=crnt.prev;
			crnt=crnt.prev;
		}
	}
	
	static void deleteFirst(){//リストの先頭の要素を削除
		crnt=head.next;
		removeCurrentNode();
		
	}
	
	static void deleteLast(){
		crnt=head.prev;
		removeCurrentNode();
	}
	
	static void deleteX(String x){
		crnt=head.next;
		while(crnt!=head){
			if(crnt.n.equals(x)){
				removeCurrentNode();
				break;
			}
			crnt=crnt.next;
		}
	}
	
	static void output(){
		crnt=head.next;
		if(!isEmpty()){
			System.out.print(crnt.n);
			crnt=crnt.next;
			while(crnt!=head){
				System.out.print(" "+crnt.n);
				crnt=crnt.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s;
		String x;
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			s=scan.next();
			if(s.equals("insert")){
				x=scan.next();
				insert(x);
			}else if(s.equals("delete")){
				x=scan.next();
				deleteX(x);
			}else if(s.equals("deleteFirst")){
				deleteFirst();
			}else{
				deleteLast();
			}
		}
		output();
		scan.close();
	}

}