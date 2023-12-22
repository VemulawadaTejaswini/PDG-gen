import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      String S = sc.next();
      char[] s = S.toCharArray();
      int answer = Integer.MAX_VALUE;
      int count0 = 0;
      for ( int i = 1; i < N; i++ ) {
        if ( s[i] == 'E' ) {
          count0++;
        }
      }
      if ( count0 < answer ) {
        answer = count0;
      }
      int prev = count0;
      for ( int i = 1; i < N; i++ ) {
        int count = prev + ( s[i-1] == 'W' ? 1 : 0 ) - ( s[i] == 'E' ? 1 : 0 );         
        if ( count < answer ) {
          answer = count;
        }
        prev = count;
      }
      System.out.println(answer);
    }
  }
  
}