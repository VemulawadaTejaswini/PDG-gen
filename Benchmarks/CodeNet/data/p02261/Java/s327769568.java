import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N;

	public void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		Card[] C1 = new Card[N],C2 = new Card[N];

		String[] str;

		for(int i = 0;i < N ; i++) {
			str = scan.next().split("");
			C1[i] = new Card(str[0],str[1],i);
			C2[i] = new Card(str[0],str[1],i);
		}

		BubbleSort(C1);
		C1[N-1].onLast();
		Arrays.asList(C1).forEach(e->e.print());
		System.out.println(isStable(C1));

		SelectionSort(C2);
		C2[N-1].onLast();
		Arrays.asList(C2).forEach(e->e.print());
		System.out.println(isStable(C2));

		scan.close();
	}

	private void BubbleSort(Card[] c) {
		for(int i = 0;i < N;i++) {
			for(int j = N-1; j > i;j-- ) {
				if(c[j].getNum() < c[j-1].getNum()) {
					Card tmp = c[j];
					c[j] = c[j-1];
					c[j-1] = tmp;
				}
			}
		}
	}

	private void SelectionSort(Card[] c) {
		int minj;
		for(int i = 0;i < N;i++) {
			minj = i;
			for(int j = i;j < N;j++) {
				if(c[j].getNum() < c[minj].getNum()) {
					minj = j;
				}
			}
			Card tmp = c[i];
			c[i] = c[minj];
			c[minj] = tmp;
		}
	}

	private String isStable(Card[] c) {
		for(int i = 0 ;i < N-1 ;i++ ) {
			if(c[i].getNum() == c[i+1].getNum() && c[i].getId() > c[i+1].getId()) {
				return "Not stable";
			}
		}
		return "Stable";
	}
}

class Card{
	private int num;
	private String mark;
	private boolean last;
	private int id;

	public Card(String mark,String num,int id) {
		this.num = Integer.parseInt(num);
		this.mark = mark;
		this.id = id;
		last = false;
	}

	public void print() {
		System.out.print(mark + Integer.toString(num) + (last ? "\n" : " " ));
	}

	public int getNum() {
		return num;
	}

	public int getId() {
		return id;
	}

	public void onLast() {
		last = true;
	}
}
