import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    String[] S = new String[N];

    for (int i = 0; i < N; i++) {
      S[i] = sc.next();
    }

    sc.close();

    String result = "Three";

    for (int i = 0; i < N; i++) {
      if (S[i].equals("Y")) {
        result = "Four";
      }
    }
    
    System.out.println(result);
 
  }

}