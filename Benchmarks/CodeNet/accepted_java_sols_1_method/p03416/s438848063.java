import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = 0;
    
    for (int i = a; i <= b; i++) {
      if (i / 10000 == i % 10 && i % 10000 / 1000 == i % 100 / 10 ) n++;
    }
    
    System.out.println(n);
  }
}
