import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int b = (y - 2 * x) / 2;
      int a = x - b;
      if(a >= 0 && b >= 0 && (2 * a + 4 * b) == y)
      	System.out.println("Yes");
  	  else
  	  	System.out.println("No");
      sc.close();
  }
}