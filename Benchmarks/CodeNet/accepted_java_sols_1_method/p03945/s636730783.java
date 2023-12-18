import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		    
		    String s = sc.nextLine();
		    int count = 0;
		    for(int i = 0; i < s.length()-1; i++ ) {
		    	if(s.substring(i,i+1).equals(s.substring(i+1,i+2))) {
		    	}
		    	else {
		    		count++;
		    	}
		    }
		    System.out.println(count);
		    
		    sc.close(); }
		  }
