import java.util.Arrays;

public class Main {
    // field

    // method
    public static void main(String[] args) {
	//System.out.print("> ");
	java.util.Scanner scan = new java.util.Scanner(System.in);
	int arraySize = scan.nextInt();
	String[] input = new String[arraySize];
	Cards[] cardsArray = new Cards[arraySize];
	//System.out.print("> ");
	for (int i = 0; i < arraySize; i++){
	    input[i] = scan.next();
	    cardsArray[i] = new Cards(input[i]);
	}    
	
	  BubbleSort bs = new BubbleSort(cardsArray.clone()); // バブルソート
	  bs.bubbleSort(); // ソート
	  bs.display();    // 表示
	  printCheck(bs.checkSort());   // 成功したかを表示
	  
	  SelectionSort ss = new SelectionSort(cardsArray.clone()); // セレクションソート
	  ss.selectionSort(); // ソート
	  ss.display();       // 表示
	  printCheck(ss.checkSort());   // 成功したかを表示
	  
    }
    private static void printCheck(boolean checkSort) {
	if(checkSort) {
	    System.out.println("Stable");
	} else{
	    System.out.println("Not stable");
	}
    }
}

class Cards {
    private String name;
    private int value;
    private int id;
    private static int count;

    public Cards(String str) {
	this.name = str;
	this.value = str.charAt(1)-48;
	this.id = this.count;
	this.count++;
    }

    public String getName() {
	return this.name;
    }
    
    public int getValue() {
	return this.value;
    }

    public int getId() {
	return this.id;
    }
    
    public void print() {
	System.out.print(this.name);
    }
}
class BubbleSort {
    // -- field
    private Cards[] sort_array;
    // -- Constructor
    private BubbleSort() {}
    public BubbleSort(Cards[] sort_array) {
	this.sort_array = sort_array;
    }
    
    // -- Method
    public void display() {
	for (int i = 0; i < this.sort_array.length; i++) {
	    this.sort_array[i].print();
	    System.out.print(" ");
	}
	System.out.println();
    }

    public void swap(int x, int y) {
	Cards temp = this.sort_array[x];
	this.sort_array[x] = this.sort_array[y];
	this.sort_array[y] = temp;
    }

    public void bubbleSort() {
	for (int i = this.sort_array.length - 1; i > 0; i--) {
	    for (int j = 0; j < i; j++) {
		if (this.sort_array[j].getValue() > this.sort_array[j + 1].getValue()) {
		    swap(j, j + 1);
		}
		// this.display(); // 動作チェック
	    }
	}
    }

    public boolean checkSort() {
	for (int i = 0; i < this.sort_array.length - 1; i++) {
	    if(this.sort_array[i].getValue() == this.sort_array[i + 1].getValue()) {
		if(this.sort_array[i].getId() > this.sort_array[i].getId()) {
		    return false;
		}
	    }
	}
	return true;
    }

}

class SelectionSort {
    // -- Field
    private Cards[] sort_array;
    // -- Constructor
    private SelectionSort() {}
    public SelectionSort(Cards[] sort_array) {
	this.sort_array = sort_array;
    }
    
    // -- Method
    public void display() {
	for (int i = 0; i < this.sort_array.length; i++) {
	    this.sort_array[i].print();
	    System.out.print(" ");
	}
	System.out.println();
    }


    public void swap(int x, int y) {
	Cards temp = this.sort_array[x];
	this.sort_array[x] = this.sort_array[y];
	this.sort_array[y] = temp;
    }

    public void selectionSort() {
	int out, in, min;
	for (out = 0; out < this.sort_array.length - 1; out++) {
	    min = out;
	    for (in = out + 1; in < this.sort_array.length; in++) {
		if (this.sort_array[in].getValue() < this.sort_array[min].getValue()) {
		    min = in;
		}
	    }
	    // System.out.println("min = " + this.sort_array[min]); // 動作確認
	    this.swap(out, min);
	    // this.display(); // 動作確認
	}
    }

    public boolean checkSort() {
	for (int i = 0; i < this.sort_array.length - 1; i++) {
	    if(this.sort_array[i].getValue() == this.sort_array[i + 1].getValue()) {
		if(this.sort_array[i].getId() > this.sort_array[i + 1].getId()) {
		    return false;
		}
	    }
	}
	return true;
    }
}

