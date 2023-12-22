import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      int a1 = i / 10000;
      int a2 = (i % 10000) / 1000;
      int a3 = (i % 1000) / 100;
      int a4 = (i % 100) / 10;
      int a5 = i % 10;

      int j = a1 + a2 + a3 + a4 + a5;
      if (j >= a && j <= b) sum += i;
      
    }
    
    System.out.println(sum);
  }
}