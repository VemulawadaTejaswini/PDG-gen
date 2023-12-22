import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();

      int max = 1;
      
      for(int i = 2; i * i <= x; i++) {
        int num = i;
        while(num * i <= x)
          num *= i;
        max = Math.max(max, num);
      }
      System.out.println(max);
  }

}
