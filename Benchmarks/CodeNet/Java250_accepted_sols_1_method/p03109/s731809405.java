import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int S1 = Integer.parseInt(S.substring(5,7));

	if (S1 < 5) {
	  System.out.println("Heisei");
	} else {
	  System.out.println("TBD");
	}

  }
}