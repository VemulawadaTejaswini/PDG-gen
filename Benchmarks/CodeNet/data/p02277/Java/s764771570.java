import java.util.Scanner;

class Card{
    public String suit;
    public int value;
    public int index;
    
    Card(String suit,int  value, int index){
	this.suit = suit;
	this.value = value;
	this.index = index;
    }
}

public class Main{
    public static void main(String[] args){
	int i, q;
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
    	Card[] A = new Card[n];

	for(i=0;i<n;i++){
	    A[i] = new Card(s.next(), s.nextInt(), i);
	}
	



	quickSort(A, 0, n-1);

	if(isStable(A) == true){
	    System.out.print("Stable\n");
	}else{
	    System.out.print("Not stable\n");
	}
	for(i=0; i<n; i++){
	    System.out.printf("%s %d\n", A[i].suit, A[i].value);
	    
	}
    }

    public static void quickSort(Card[] A, int p, int r){
	int q;
	if(p < r){
	    q = partition(A, p, r);
	    quickSort(A, p, q - 1);
	    quickSort(A, q + 1, r); 
	}
    }
    
    public static int partition(Card[] A, int p, int r){
	int x, i, j;
	Card tmp;
	x = A[r].value;
	i = p-1;
	for(j=p; j<r; j++){
	    if(A[j].value<=x){
		i++;
		tmp = A[i]; A[i] = A[j]; A[j] = tmp;
	    }
	}
	tmp = A[i+1]; A[i+1] = A[r]; A[r] = tmp;
	return i+1;
    }
    
    static boolean isStable(Card[] A){
	for(int i = 0; i < A.length; i++){
	    for(int j = i + 1; j < A.length; j++){
		if(A[i].value == A[j].value && A[i].index > A[j].index)
		    return false;
	    }
	}
    return true;
    }	    
}