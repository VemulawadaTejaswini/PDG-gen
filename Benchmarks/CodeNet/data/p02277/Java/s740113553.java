
import java.util.Scanner;
public class Main {
	
 static    class Card {
        char suit;
        int num;
        int idx;
 
        public Card(char suit, int num, int idx) {
            this.suit = suit;
            this.num = num;
            this.idx = idx;
        }
 
      /*  @Override
        public String toString() {
            return "[p=" + suit + ", n=" + num + ", id=" + idx + "]\n";
        }
        */
 
    }

	
	public  static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 要素の個数
		  Card[] A = new Card[n];
	        for (int i = 0; i < n; i++) {
	            A[i] = new  Card(scan.next().charAt(0), scan.nextInt(), i);
	        }
	        Quicksort(A,0,n-1);
	        check(A,n);
	        for(int i=0;i<n;i++){
	        	if(i != n-1){
	        		System.out.print(A[i].suit+" ");
	        		System.out.print(A[i].num);
	        		System.out.println();
	        	}else{
	        		System.out.print(A[i].suit+" ");
	        		System.out.print(A[i].num);
	        		System.out.println();
	        	}
	        }
	
	}
	

	public static  int Partition(Card[] num, int p, int r) {
		int x = num[r].num;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (num[j].num <= x) {
				i = i + 1;
				Card tmp = num[i];
				num[i] = num[j];
				num[j] = tmp;
			}

		}
		Card tmp = num[i + 1];
		num[i + 1] = num[r];
		num[r] = tmp;
		return i + 1;
	}
	
	public  static  void Quicksort(Card[] A, int p, int r){
		if(p < r){
			int q = Partition(A,p,r);
			Quicksort(A,p,q-1);
			Quicksort(A,q+1,r);
		}
	//	return A;
	}

	 static  void swap(String[] a,int idx1,int idx2){
	        String temp = a[idx1];
	        a[idx1] = a[idx2];
	        a[idx2] = temp;
	    }
	 
	 static  void check(Card[] A,int n){
		  for(int i=0;i<n-1;i++){
		    if(A[i].num == A[i+1].num){
		    	if(A[i].idx > A[i+1].idx){
		    		System.out.println("Not Stable");
		    		   return;
		    	}
		 
		    }
		  }
		    System.out.println("Stable");
		}
		 



}

