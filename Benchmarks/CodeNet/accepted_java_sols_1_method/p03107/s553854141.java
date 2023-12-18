/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String cubeStr = sc.nextLine();
	    int length = cubeStr.length();
	    List<Character> list = new ArrayList<Character>();
	    for(int i=0; i<length; i++){
	        list.add(cubeStr.charAt(i));
	    }
	    
	    int sequence = 0;
	    int numOfCubesCleared = 0;
	    
	    while(sequence < list.size()-1){
	        if (list.get(sequence) != list.get(sequence+1)){
	            list.remove(sequence);
	            list.remove(sequence);
	            numOfCubesCleared += 2;
	            sequence = Math.max(0, sequence-1);
	        }else{
	            sequence++;
	        }
	    }
	    System.out.println(numOfCubesCleared);
		
	}
}
