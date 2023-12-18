import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    // Input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Card[] c1 = new Card[n];
    Card[] c2 = new Card[n];
    
    for(int i = 0; i < n; ++i) {
    	String s = sc.next();
    	c1[i] = new Card(s);
    	c2[i] = new Card(s);
    }

	// Sort
  	Sort.BubbleSort(c1);
  	Sort.SelectionSort(c2);
  	
  	// Output
  	for(int i = 0; i < n; ++i) {
  		System.out.print(i == 0 ? c1[i] : " " + c1[i]);
  	}
  	System.out.println();
 	System.out.println("Stable");
 	
 	Boolean eq = true;
  	for(int i = 0; i < n; ++i) {
  		System.out.print(i == 0 ? c2[i] : " " + c2[i]);
  		if(!c2[i].equals(c1[i])) {
  			eq = false;
  		}
  	}
  	System.out.println();
  	if(eq){
  		System.out.println("Stable");
  	}else{
  		System.out.println("Not stable");
	}
  }
  
}

class Sort {
	public static void BubbleSort(Card[] c) {
		for(int i = 0; i < c.length; ++i) {
			for(int j = c.length - 1; j > i; --j) {
				if(c[j - 1].isGreaterThan(c[j])) {
					Card tmp = c[j];
					c[j] = c[j-1];
					c[j-1] = tmp;
				}
			}
		}
	}
	
	public static void SelectionSort(Card[] c) {
		for(int i = 0; i < c.length; ++i) {
			int minj = i;
			for(int j = c.length - 1; j > i; --j) {
				if(c[minj].isGreaterThan(c[j])){
					minj = j;
				}
			}
			Card tmp = c[minj];
			c[minj] = c[i];
			c[i] = tmp;
		}
		
	}
}

class Card implements Comparable<Card>{
	private char suit;
	private int value;
	
	public Card(String s) {
		set(s);
	}
	public void set(String s) {
		this.suit = s.charAt(0);
		this.value = Character.getNumericValue(s.charAt(1));
	}

	@Override
	public int compareTo(Card c) {
		return this.value - c.value;
	}
	
	public boolean isGreaterThan(Card c) {
		return compareTo(c) > 0;	
	}
	
	@Override
	public boolean equals(Object c) {
		return (this.suit == ((Card)c).suit) && (this.value == ((Card)c).value);
	}
	
	@Override
	public String toString(){
		return(this.suit + String.valueOf(this.value));
	}
	
}