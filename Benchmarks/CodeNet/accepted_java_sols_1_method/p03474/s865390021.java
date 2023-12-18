import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String N = sc.next();
    Boolean bool = true;
    
    try {
      int a = Integer.parseInt(N.substring(0, A));
      int b = Integer.parseInt(N.substring(A+1));
      bool = true;
    } catch (NumberFormatException nfex) {
		bool = false;
	}

    if(N.length() == A+B+1 && N.substring(A, A+1).equals("-") && bool) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}