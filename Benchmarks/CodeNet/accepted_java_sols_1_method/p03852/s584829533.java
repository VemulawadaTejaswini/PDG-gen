import java.util.Scanner;

public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.next();
	    String a = "aiueo";
	    
	    if(a.contains(s)) {
	    	System.out.println("vowel");
	    }else {
	    	System.out.println("consonant");
	    }
	    
	}
}