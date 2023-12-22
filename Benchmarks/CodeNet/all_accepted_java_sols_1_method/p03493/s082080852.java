import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    String s = sc.nextLine();
	    
	    System.out.println(s.replaceAll("0", "").length());
	}    
}