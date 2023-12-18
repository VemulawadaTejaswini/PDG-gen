import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    private static StringTokenizer st;

    public static void main ( String [] args ) throws IOException
    {
	new Main().cal();
    }

    private class Card {
	public char pattern;
	public int num;
	public int order;

	public String toString() {
	    return pattern + String.valueOf(num);
	}
    }

 
    private void cal() throws IOException 
    {
	int N = Integer.parseInt(br.readLine());
	Card [] cards = new Card[N];
	st = new StringTokenizer(br.readLine());


	for(int i = 0; i < cards.length; i++) {
	    String s = st.nextToken();
	    cards[i] = new Card();
	    cards[i].pattern = s.charAt(0);
	    cards[i].num = Integer.parseInt(s.substring(1));
	    cards[i].order = i;
	}

	Card [] c1 = BubbleSort(cards);
	Card [] c2 = SelectionSort(cards);

	for(int i = 0; i < c1.length; i++) {
	    if ( i > 0 ) System.out.print(" ");
	    System.out.print(c1[i]);
	}
	System.out.println("");

	if ( isStable(c1) ) System.out.println("Stable");
	else System.out.println("Not stable");

	


	for(int i = 0; i < c2.length; i++) {
	    if ( i > 0 ) System.out.print(" ");
	    System.out.print(c2[i]);
	}
	System.out.println("");

	if ( isStable(c2) ) System.out.println("Stable");
	else System.out.println("Not stable");



	

    }

    private Card[] BubbleSort(final Card[] c) {
	assert c!= null;

	Card[] ret = (Card[])c.clone();
	
	//	System.out.println("ret length: " + ret.length + "ret[0] : " + ret[0]);

	for(int i = 0; i < ret.length; i++) {
	    for(int j = ret.length -1; j >= i+1; j--) {
		if ( ret[j].num < ret[j-1].num ) 
		    swap(ret, j, j-1);
	    }

	}

	return ret;
    }

    private Card[] SelectionSort(final Card[] c) {
	assert c != null;

	Card[] ret = (Card[])c.clone();
	for(int i = 0; i < ret.length; i++) {
	    int mini = i;
	    for(int j = i; j < ret.length; j++) {
		if ( ret[j].num < ret[mini].num ) mini = j;
	    }
	    if ( mini != i ) swap(ret, i, mini);
	}

	return ret;
    }

    private void swap(Object [] o, final int i, final int j) {
	Object temp = o[i];
	o[i] = o[j];
	o[j] = temp;
    }

    private boolean isStable(final Card [] c) {
	assert c != null;
	
	for(int i = 0; i < c.length-1; i++) {
	    if ( c[i].num == c[i+1].num && c[i].order > c[i+1].order ) return false;
	}
	
	return true;

    }
    
}