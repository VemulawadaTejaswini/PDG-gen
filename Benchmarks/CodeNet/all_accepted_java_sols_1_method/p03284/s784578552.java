import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p = sc.nextInt();
      int avg = n / p;
      System.out.println(Math.abs(n - avg * p) == 0 ? 0 : 1);
  }
}