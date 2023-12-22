import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int pp = sc.nextInt();
      int days = sc.nextInt();
      int x = sc.nextInt();
      int cost = 0;
      for(int i = 0; i < pp; i++)
        cost += (days - 1) / sc.nextInt() + 1;

      System.out.println(cost + x);
  }
}