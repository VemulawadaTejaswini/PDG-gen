import java.util.Scanner;

public class Main  {
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int r = sc.nextInt();
	int[] cards = new int[n];
	for(int i=0; i<n;++i){
	    cards[i] = i ;
	}

	
	for(int i=0; i<r;++i){
	    int p = sc.nextInt();
	    int c = sc.nextInt();

	    if(p == 0 && c == 0){
		return;
	    }

	    int[] dropped = new int[p];
	    for(int j=0; j<p - 1;++j){ 
		dropped[j] = cards[j];
	    }

	    int[] taken = new int[c];
	    for(int j=0; j<c;++j){
		taken[j] = cards[p + c];
	    }

	    for(int j=0; j<c;++j){
		cards[j] = taken[j];
	    }

	    for(int j=0; j<p - 1;++j){
		cards[c + j] = dropped[j];
	    }

	    System.out.println(cards[0]);
	    
	    for(int j=0; j<n;++j){
		cards[j] = j ;
	    }
	    
	}

	sc.close();
    }
}