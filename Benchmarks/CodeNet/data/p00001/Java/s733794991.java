package mountain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class mountain {

	public static void main(int[] args) {
		Scanner scan = new Scanner(System.in);
 
		
		ArrayList<Integer> mountain = new ArrayList<Integer>();
		

	     Collections.sort(mountain);
     Collections.reverse(mountain);
     
     for(int i =0; i <  3; i++){
     System.out.println(mountain.get(i));
     }
    		 
             }
	}