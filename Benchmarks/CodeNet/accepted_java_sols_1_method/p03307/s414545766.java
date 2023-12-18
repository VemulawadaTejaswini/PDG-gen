import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n % 2 == 0)
        System.out.println(n);
      else if (2 % n == 0)
        System.out.println(2);
      else 
        System.out.println(2*n);
  }
}