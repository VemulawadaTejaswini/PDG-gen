import java.util.Arrays;

public class Main {
    // field

    // method
    public static void main(String[] args) {
	//System.out.print("> ");
	java.util.Scanner scan = new java.util.Scanner(System.in);
	int arraySize = scan.nextInt();
	String[] input = new String[arraySize];
	int[] array = new int[arraySize];
	//System.out.print("> ");
	for (int i = 0; i < arraySize; i++){
	    array[i] = scan.nextInt();
	}
	
	SelectionSort ss = new SelectionSort(array.clone()); // セレクションソート
	ss.selectionSort(); // ソート
	ss.display();       // 表示
	System.out.println(ss.getCount());
	
    }
}
class SelectionSort {
    // -- Field
    private int[] sort_array;
    protected int count;
    // -- Constructor
    private SelectionSort() {}
    public SelectionSort(int[] sort_array) {
	this.sort_array = sort_array;
    }
    
    // -- Method
    public void display() {
	for (int i = 0; i < this.sort_array.length; i++) {
	    System.out.print(this.sort_array[i]);
	    if(i == this.sort_array.length-1) {
		break;
	    }
	    System.out.print(" ");
	}
	System.out.println();
    }


    public void swap(int x, int y) {
	int temp = this.sort_array[x];
	this.sort_array[x] = this.sort_array[y];
	this.sort_array[y] = temp;
    }

    public void selectionSort() {
	int out, in, min;
	for (out = 0; out < this.sort_array.length - 1; out++) {
	    min = out;
	    for (in = out + 1; in < this.sort_array.length; in++) {
		if (this.sort_array[in] < this.sort_array[min]) {
		    min = in;
		}
	    }
	    if (out != min) this.count++;
	    this.swap(out, min);
	}
    }
    public int getCount() {
	return this.count;
    }
}

