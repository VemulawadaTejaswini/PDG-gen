import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();
    int count =0, countF =0, countL =0;
    for (int i =0; i<N/2; i++) {
      if(S.charAt(i) == S.charAt(N-1-i)) count++;
    }
    String SF = S.substring(0,(N-1)/2);
    String SL = S.substring((N+1)/2,N);
    for (int i =0; i<SF.length()/2; i++) {
      if(SF.charAt(i) == SF.charAt(SF.length()-1-i)) countF++;
      if(SL.charAt(i) == SL.charAt(SF.length()-1-i)) countL++;
    }
    if (count == N/2 && countF == SF.length()/2 && countL == SF.length()/2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}