import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int x = 0;
    int Max = 0;
    
    
    for(int i=0; i<S.length(); i++) {
      String l = S.substring(i, i+1);
      if(l.equals("I")) {
        x++;
      } else {
        x--;
      }
      if(x>Max) {
        Max = x;
      }
    }
    System.out.println(Max);
  }
}