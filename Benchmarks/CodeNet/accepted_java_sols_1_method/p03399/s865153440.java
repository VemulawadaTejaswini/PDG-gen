import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    int X = Math.min(sc.nextInt(), sc.nextInt());
	    int Y = Math.min(sc.nextInt(), sc.nextInt());
	    
	    System.out.println(X+Y);
	}    
}	