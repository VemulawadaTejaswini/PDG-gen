import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = 0;
    
    for (int i = 0; i < (b - a + 1); i++) {
      String s[] = String.valueOf(a + i).split("");
      String t = s[4] + s[3] + s[2] + s[1] + s[0];
      
      if (String.valueOf(a + i).equals(t)) n++;
    }
    
    System.out.println(n);
  }
}