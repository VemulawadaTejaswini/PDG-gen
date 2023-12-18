import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m;
		
		LinkedList list = new LinkedList();
		
		for(int i = 0; i < n; i++){
			String[] meirei = br.readLine().split(" ");
			
			if(meirei[0].equals("deleteFirst")){
				list.removeFirst();
			}else if(meirei[0].equals("deleteLast")){
				list.removeLast();
			}else if(meirei[0].equals("insert") || meirei[0].equals("delete")){
				m = Integer.parseInt(meirei[1]);
				if(meirei[0].equals("insert")){
					list.insertLast(m);
				}else{
					list.delete(m);
				}
			}
		}
		System.out.println(list.toString());
	}
}

class Room{
	Room prev; //???????????????????????????
	Room next; //?¬?????????????????????????
	int data; //??????????????????
	
	public Room(int data){
		this.data = data;
		prev = null;
		next = null;
	}

}

class LinkedList {
	final Room head;
	
	public LinkedList(){
		head = new Room(0);
		head.next = head;
		head.prev = head.next;
	}
	
	//??????p?????´??????data????????\
	private void insertAfter(Room p,int data){
		Room x = new Room(data);
		x.prev = p;
		x.next = p.next;
		p.next.prev = x;
		p.next = x;
	}
	
	public void insertLast(int data){
		insertAfter(head.prev,data);
	}
	
	//?????????????????????????????????
	private void remove(Room p){
		p.prev.next = p.next;
		p.next.prev = p.prev;
	}
	
	public Object removeFirst(){
		Room cell = head.prev;
		remove(cell);
		return cell.data;
	}
	
	public Object removeLast(){
		Room cell = head.next;
		remove(cell);
		return cell.data;
	}
	
	public void delete(int num){
		Room p = head.next;
		Room q = head;
		
		while(num != (Integer)p.data){
			q = p;
			p = p.next;
		}
		remove(p);
	}

	public String toString(){
		StringBuilder st = new StringBuilder();
		for(Room p=head.next; p != head; p = p.next){
			if(p != head.prev){
				st.append(p.data + " ");
			}else{
				st.append(p.data);
			}
		}
		return st.toString();
	}
}   