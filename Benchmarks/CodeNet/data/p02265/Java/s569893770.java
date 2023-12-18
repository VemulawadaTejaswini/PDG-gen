import java.util.Scanner;
class Node{
	Node next;
	int n;
}
public class Main {
	static Node head;
	
	
	static void insert(int x){
		Node tmp=new Node();
		tmp.n=x;
		tmp.next=head.next;
		head.next=tmp;
	}
	
	static boolean isEmpty(){
		return head.next==null;
	}
	
	
	static void deleteFirst(){//リストの先頭の要素を削除
		head.next=head.next.next;
	}
	
	static void deleteLast(){
		Node tmp=head;
		if(!isEmpty()){
			while(tmp.next.next!=null){
				tmp=tmp.next;
			}
			tmp.next=null;
		}
	}
	
	static void deleteX(int x){
		Node tmp=head;
		while(tmp!=null){
			if(tmp.next.n==x){
				tmp.next=tmp.next.next;
				break;
			}
			tmp=tmp.next;
		}
	}
	
	static void output(){
		Node tmp=head.next;
		if(!isEmpty()){
			System.out.print(tmp.n);
			tmp=tmp.next;
			while(tmp!=null){
				System.out.print(" "+tmp.n);
				tmp=tmp.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		head=new Node();
		head.next=null;
		String s;
		int x;
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			s=scan.next();
			if(s.equals("insert")){
				x=scan.nextInt();
				insert(x);
			}else if(s.equals("delete")){
				x=scan.nextInt();
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