import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    int[] b = new int[a];    
    for (int i = 0; i < a; i++) {
      b[i] = sc.nextInt();
    }
    
    int min = 2147483647;
    for (int i = 0; i < a-1; i++) {
      int c = 0;
      int d = 0;
      for (int j = 0; j <= i; j++) {
        c += b[j];
      }
      for (int j = i + 1 ; j < a ; j++) {
        d += b[j];
      }
      if (c < d) {
        if (min > d - c) {
          min = d -c ;
        }
      } else {
        if ( min > c - d) {
          min = c - d;
        }
      }
    }
    
    System.out.println(min);
   
  }
}