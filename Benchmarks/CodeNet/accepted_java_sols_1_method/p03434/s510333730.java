import java.util.*;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      Integer[] card = new Integer[n];
	      int alice = 0;
	      int bob = 0;
	      for(int i=0; i<n; i++) {
	  		card[i] = sc.nextInt();
	  	}
	      Arrays.sort(card, Comparator.reverseOrder());;
	      for(int i=0; i<n; i++) {
	    	  if(i%2 == 0) {
	    		  alice += card[i];
	    	  }
	    	  else {
	    		  bob += card[i];
	    	  }
	      }
	      System.out.println(alice - bob);
	}
}