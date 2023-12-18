import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int w = sc.nextInt();
    
    for (int i = 0; i < h+2; i++) {
       String s = "";
       if (1 <= i && i <= h) {
         s = sc.next();
       }
       for (int j = 0; j < w+2; j++) {
         char c = '#';
         if (1 <= i && i <= h && 1 <= j && j <= w) {
            c = s.charAt(j-1);
         }
         System.out.print(c);
      }
      System.out.println();
    }
  }
}