import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] array=new String[2];
		int num;

		LinkedList list=new LinkedList();
		try{
		int n=Integer.parseInt(reader.readLine());
		num=-1;

		for(int i=0;i<n;i++){
			str=reader.readLine();
			if(str.equals("deleteFirst")||str.equals("deleteLast")){
				array[0]=str;
				}else{array=str.split(" ");
				num=Integer.parseInt(array[1]);
					}


			switch(array[0]){
			case "insert":
				list.insert(num);
				break;
			case "delete":
				list.delete(num);
				break;
			case "deleteFirst":
				list.deleteFirst();
				break;
			case "deleteLast":
				list.deleteLast();
				break;
			default:
				break;
			}
		}

		list.outputAll();

		}catch(IOException e){

		}



	}//main
}

class LinkedList{

	static class Node{
		int data;
		Node prev;
		Node next;

		Node(int data, Node prev, Node next){
			this.data=data;
			this.prev=prev;
			this.next=next;
		}
	}

	Node ptr, head;

	LinkedList(){
		ptr=head=null;
	}

	void insert(int num){
		ptr=head;
		head=new Node(num, null, ptr);
		if(ptr!=null)ptr.prev=head;
	}

	void delete(int num){
		int cnt=0;
		while(ptr!=null){
			if(ptr.data==num){
				//??????
				cnt++;
				if(ptr.next==null&&ptr.prev==null)head=null;
			    else if(ptr.prev==null)deleteFirst();
				else if(ptr.next==null)deleteLast();
				else{
				Node Prev=ptr.prev;
				Node Next=ptr.next;
				Prev.next=ptr.next;
				Next.prev=ptr.prev;
				}
				break;
			}
			if(cnt==1)break;
			ptr=ptr.next;
		}

	}

	void deleteFirst(){
		if(head.next==null)head=null;//???????????????????????¨????????\??????
		else{
		head=ptr.next;
		head.prev=null;
		}
	}

	void deleteLast(){
		if(head.next==null)head=null;//?????????????????????????????\??????
		else{
		while(ptr.next!=null){
			ptr=ptr.next;
		}
		ptr=ptr.prev;
		ptr.next=null;
		}

	}

	void outputAll(){
		ptr=head;
		while(ptr.next!=null){
			System.out.print(ptr.data+" ");
			ptr=ptr.next;

		}System.out.println(ptr.data);
	}

}