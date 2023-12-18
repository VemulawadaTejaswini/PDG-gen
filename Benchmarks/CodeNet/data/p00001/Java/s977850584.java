
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
	    ArrayList<Integer> Al = new ArrayList<Integer>();
	    
		// Read in
	    for (Integer i = 0; i < 10; i++){
	    	Scanner user_input = new Scanner( System.in );
	    	Al.add(Integer.valueOf(user_input.toString()));
		}
	    
		// Quick Sort
	    Collections.sort(Al);
	    
		// Print first 3
	    Integer i = Al.size() - 1;
	    Integer numOfElements = 3;
	    while (i >= Al.size()-numOfElements){
	    	System.out(Al.get(i));
	    	i--;
	    }
	}
}