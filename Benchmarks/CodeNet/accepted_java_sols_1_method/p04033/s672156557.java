import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    long total = 0;
    
    if(a<=0 && b>=0) {
      System.out.println("Zero");
    } else {
      for(int i=a; i<b+1; i++) {
        if(i<0) {
          total++;
        }
      }
      if(total % 2 == 0) {
        System.out.println("Positive");
      } else {
        System.out.println("Negative");
      }
    }
  }
}