import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c[] = new String[3];
    
    for (int i = 0; i < 3; i++)
      c[i] = sc.next();
    
    for (int i = 0; i < 3; i++)
      System.out.print(c[i].substring(i, i+1));
  }
}