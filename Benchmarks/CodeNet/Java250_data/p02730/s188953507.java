import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();
    String X = S.substring(0,(N-1)/2);
    String Y = S.substring(((N+3)/2)-1,N);
    if(X.equals(Y)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}