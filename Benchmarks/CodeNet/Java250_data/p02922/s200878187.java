import java.util.*;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a = Integer.parseInt(sc.next());
	    int b = Integer.parseInt(sc.next());
	    
	    int counter = 0;
	   
	    while(a * counter - (counter - 1) < b) {
	        ++counter;
	    }
	    System.out.println(counter);
	  
	}
}