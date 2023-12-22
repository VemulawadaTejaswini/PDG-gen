import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      int z = Integer.parseInt(sc.next());
      int work;

      work = x;
      x = y;
      y = work;

      work = x;
      x = z;
      z = work;

      System.out.print(x);
      System.out.print(" ");
      System.out.print(y);
      System.out.print(" ");
      System.out.print(z);
    }
}
