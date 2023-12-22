import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String C = scanner.next();
	    String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	    
	    for (int i = 0; i < alphabets.length; i++) {
	    	if (C.equals(alphabets[i])) {
	    		C = alphabets[i + 1];
	    		break;
	    	}    	   
	    }
	    System.out.println(C);
	    
	}
	
}	