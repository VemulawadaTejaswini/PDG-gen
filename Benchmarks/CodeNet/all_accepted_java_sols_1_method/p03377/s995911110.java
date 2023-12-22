import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int a, b, x;
      a = Integer.parseInt(scan.next());
      b = Integer.parseInt(scan.next());
      x = Integer.parseInt(scan.next());

      if(a <= x && x-a <= b){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    catch (Exception e) {

    }
  }
}
