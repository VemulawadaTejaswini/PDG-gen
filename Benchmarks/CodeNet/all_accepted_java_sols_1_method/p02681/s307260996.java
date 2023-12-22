import java.util.Scanner;
 
 
	public class Main{
	  public static void main(String[] args) {
		  
		  Scanner scanner = new Scanner(System.in);
		  
		    String S = scanner.next();
	 		String T = scanner.next();
	 		
		  if (T.length() == S.length()+1 && T.indexOf(S) == 0) {
			  System.out.println("Yes");
		  }
		  else{
			  System.out.println("No");
		  }
		  scanner.close();
	}
}