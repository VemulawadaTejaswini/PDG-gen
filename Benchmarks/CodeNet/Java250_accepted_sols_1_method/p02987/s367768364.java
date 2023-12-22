import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arrayStr = sc.next().split("");

	    Set<String> linkedHashSet = new LinkedHashSet<String>();

	    for (int i = 0; i < arrayStr.length; i++) {
	    	
	    linkedHashSet.add(arrayStr[i]);
	    
	    }
	    
	    Object[] strings_after = linkedHashSet.toArray();
	    
	    if(strings_after.length == 2 ) {
	    	
	    	System.out.println("Yes");
	    	
	    } else {
	    	
	    	System.out.println("No");
	    }

	  }

}
