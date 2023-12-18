import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	Scanner scan;

	private int N,M,Q;
	private int[] state;
	private LoopList circle;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		Q = scan.nextInt();

		state = new int[N];
		circle = new LoopList();

		Arrays.fill(state, 1);
		circle.init(N);

		for(int i = 0;i < M;i++) {
			looprun(scan.nextInt());
		}

		for(int i = 0;i < Q;i++) {
			System.out.println(state[scan.nextInt()]);
		}

		scan.close();
	}

	private void looprun(int a) {
		if(a%2 == 0) {
			circle.next(a);
		}else {
			circle.prev(a);
		}

		state[circle.delete()] = 0;
	}
}

class LoopList{

	private Data head,d,n,p,now;

	public LoopList() {
		head = new Data();

		head.next = head;
		head.prev = head;

		head.num = -1;
	}

	public Data getHead() {
		return head;
	}

	public void init(int num){
		d = new Data();
		d.num = 0;
		head.next = d;

		for(int i = 1;i < num;i++) {
			p = d;
			d = new Data();
			d.num = i;

			p.next = d;
			d.prev = p;
		}

		d.next = head.next;
		head.next.prev = d;

		now = head.next;
	}

	public void next(int n) {
		for(int i = 0;i<n;i++) {
			now = now.next;
		}
	}

	public void prev(int n) {
		for(int i = 0;i<n;i++) {
			now = now.prev;
		}
	}

	public int delete(){
		n = now.next;
		p = now.prev;

		int num = now.num;
		now = now.next;

		n.prev = p;
		p.next = n;

		return num;
	}

	class Data{
		int num;
		Data next,prev;
	}
}
