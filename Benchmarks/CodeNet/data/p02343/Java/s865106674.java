import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N,Q;
	private Item[] A;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		Q = scan.nextInt();

		A = new Item[N];

		for(int i = 0;i < N;i++) {
			A[i] = new Item(i);
		}

		for(int i= 0;i < Q;i++) {
			int com = scan.nextInt();

			if(com == 0) {
				Unite(scan.nextInt(),scan.nextInt());
			}else {
				System.out.println(Same(scan.nextInt(),scan.nextInt()));
			}
		}
		scan.close();
	}

	private void Unite(int x,int y) {

		int nx = Recursive(x);
		int ny = Recursive(y);

		if(nx != ny) {
			A[ny].next = nx;
			A[ny].base = false;
		}
	}

	private int Same(int x,int y) {
		return Recursive(x) == Recursive(y) ? 1 : 0;
	}

	private int Recursive(int num) {
		Item item = A[num];

		while(!item.base) {
			item = A[item.next];
		}

		return item.id;
	}
}

class Item{
	int id,next;
	boolean base;

	public Item(int id) {
		this.id = id;
		base = true;
		next = -1;
	}
}


