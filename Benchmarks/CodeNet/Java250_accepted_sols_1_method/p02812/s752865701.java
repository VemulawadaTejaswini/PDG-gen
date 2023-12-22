import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String S = sc.next();
    int ok = 0;
    for(int i = 0; i < N-2; i++) {
      if (S.substring(i,i+1).equals("A")) {
        if (S.substring(i,i+3).equals("ABC")) {
          ok++;
        }
      }
    }
    sc.close();

    System.out.println(ok);
  }
}
    
