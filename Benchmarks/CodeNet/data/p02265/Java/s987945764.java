import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String args[]) throws NumberFormatException, IOException{
		new Main().mainrun();
	}

    private BufferedReader br;

	private int n;
	private LoopList lp;

	public void mainrun() throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		lp = new LoopList();

		for(int i = 0;i < n;i++) {
			looprun();
		}

		lp.print();

	}

	private void looprun() throws IOException {
		String[] str = br.readLine().split(" ");
		switch(str[0]) {
		case "insert":
			lp.insert(Integer.parseInt(str[1]));
			break;
		case "delete":
			lp.delete(Integer.parseInt(str[1]));
			break;
		case "deleteFirst":
			lp.deleteFirst();
			break;
		case "deleteLast":
			lp.deleteLast();
			break;
		}
	}

}

class LoopList{

	private Data head,d,n,p;

	public LoopList() {
		head = new Data();

		head.next = head;
		head.prev = head;

		head.num = -1;
	}

	public Data getHead() {
		return head;
	}

	public void insert(int key){
		d = new Data();
		d.num = key;

		Data rd = head.next;

		head.next = d;

		d.prev = head;
		d.next = rd;

		rd.prev = d;
	}

	public void delete(int key){
		d = head.next;

		while(d.num != -1 && d.num != key) {
			d = d.next;
		}

		if(d.num == key) {
			n = d.next;
			p = d.prev;

			n.prev = p;
			p.next = n;

		}
	}

	public void deleteFirst(){
		d = head.next;
		n = d.next;

		n.prev = head;
		head.next = n;
	}

	public void deleteLast(){
		d = head.prev;
		p = d.prev;

		p.next = head;
		head.prev = p;
	}

	public void print() {
		d = head.next;
		int nnum ;

		while(d.num != -1) {
			nnum = d.next.num;
			System.out.print(d.num + (nnum == -1 ? "\n" : " "));
			d = d.next;
		}
	}

	class Data{
		int num;
		Data next,prev;
	}
}
