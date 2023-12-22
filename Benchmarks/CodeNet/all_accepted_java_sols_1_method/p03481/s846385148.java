import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X=sc.nextLong(), Y=sc.nextLong(),c=1;
    while(true) {
      X *= 2;
      if(X<=Y) {
        c++;
      } else break;
    }
    System.out.println(c);
  }
}