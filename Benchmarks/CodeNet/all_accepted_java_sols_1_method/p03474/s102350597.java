import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int A = Integer.parseInt(sc.next());
	  int B = Integer.parseInt(sc.next());
	  String[] S = sc.next().split("-");
	  
	  if(S.length == 2) {
		  if(S[0].length() == A && S[1].length() == B) {
			  System.out.println("Yes");
			  sc.close();
			  System.exit(0);
		  }
		  	
	  }
	  
	  System.out.println("No");
	  sc.close();
	  
  }
}
