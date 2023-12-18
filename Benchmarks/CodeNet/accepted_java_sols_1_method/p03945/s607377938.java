import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();

    sc.close();

    String[] S = s.split("");

    int count = 0;

    String current = S[0];

    for (int i = 1; i < S.length; i++) {
  
      if (!(current.equals(S[i]))){
        count++;
        current = S[i];
      }

    }
    
    System.out.println(count);

  }

}