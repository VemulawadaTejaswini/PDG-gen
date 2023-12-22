import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] S = sc.next().toCharArray();
    
    for (int i = 0; i < S.length; i++) {
      S[i] = (char)((S[i] - 'A' + N) % 26 + 'A');
    }
    System.out.print(String.valueOf(S));
  }
}