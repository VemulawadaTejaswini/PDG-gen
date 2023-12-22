import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int d = sc.nextInt();
      int n = sc.nextInt();
      int num = 100;
      num = (int) Math.pow(num, d);
      
      if(n % 100 == 0) n++;
      System.out.println(num * n);
  }
}
