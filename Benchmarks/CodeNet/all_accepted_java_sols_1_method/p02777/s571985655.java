import java.util.*;

public class Main {
  	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
	    String S = scanner.next();

	    String T = scanner.next();

		int a = scanner.nextInt();
		int b = scanner.nextInt();
	    String U = scanner.next();
 if(U.equals(S)) {
	    	System.out.println((a-1)+" "+b);
	    }else if(U.equals(T)) {
	    	System.out.println(a+" "+(b-1));
	    }
	  		scanner.close();
    }

}

