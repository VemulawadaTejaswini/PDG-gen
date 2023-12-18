import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    
	    String[] a = S.split("");
	    
	    if (a[0].equals(a[1]) || a[1].equals(a[2]) || a[2].equals(a[3]))
	    
	    	 System.out.println("Bad");
	    
	    else 
	    	 System.out.println("Good");
	    
	   sc.close();
	}

}