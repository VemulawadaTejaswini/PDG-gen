import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	//ヒープのサイズ
	int H;
	//節点の番号(1...H),要素数はH+1で確保する
	int[] Array;
	
	public void input() {
		H = sc.nextInt();
		Array = new int[H+1];
		//0...H
		for(int i=1; i<Array.length; i++) { Array[i] = sc.nextInt(); }
	}
	
	public void buildMaxHeap() { for(int i=H/2; i>=1; i--) { maxHeapify(i); } }
	
	public void maxHeapify(int i) {
		int left = 2 *i;
		int right = 2 * i + 1;
		int large;
		int temp;
		
		//左の子、右の子、自分で値が最大の節を選択
		if(left <= H && Array[left] > Array[i]) { large = left; }
		else { large = i; }
		if(right <= H && Array[right] > Array[large]) { large = right; }
		if(large != i) {
			temp = Array[i];
			Array[i] = Array[large];
			Array[large] = temp;
			maxHeapify(large);
		}
	}
	
	public void output() {
		for(int i=1; i<Array.length; i++) {
			System.out.print(" "+Array[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.buildMaxHeap();
		obj.output();
	}
}

