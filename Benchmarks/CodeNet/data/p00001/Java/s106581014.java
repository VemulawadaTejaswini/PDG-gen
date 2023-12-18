package mountain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class mountain {

	public static void main(int[] args) {
		Scanner scan = new Scanner(System.in);
 
		
		ArrayList<Integer> mountain = new ArrayList<Integer>();
		

	/*	 array.add(1819);
         array.add(2003);
         array.add(876);
         array.add(2840);
         array.add(1723);
         array.add(1673);
         array.add(3776);
         array.add(2848);
         array.add(1592);
         array.add(922);
*/

     Collections.sort(mountain);
     Collections.reverse(mountain);
     
     for(int i =0; i <  3; i++);
     System.out.println(mountain.get(i));
    		 
             }
	}