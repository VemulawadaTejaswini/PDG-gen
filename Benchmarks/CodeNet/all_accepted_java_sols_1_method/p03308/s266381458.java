import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      while(n-- > 0) {
        int num = sc.nextInt();
        min = Math.min(min, num);
        max = Math.max(max, num);
      }
      System.out.println(max - min);
  } 
}
