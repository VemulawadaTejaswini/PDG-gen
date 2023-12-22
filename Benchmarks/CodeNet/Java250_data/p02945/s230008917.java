import java.util.*;

public class Main {
  static int[] list;
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = a + b;
      int y = a - b;
      int z = a * b;
      System.out.println(Math.max(x,Math.max(y,Math.max(z,y))));
      
    }
}