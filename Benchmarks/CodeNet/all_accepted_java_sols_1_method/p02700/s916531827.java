import java.util.*;
//import java.util.Arrays;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());

      double x = (double)a/d;
      double y = (double)c/b;
      x = Math.ceil(x);
      y = Math.ceil(y);

      if(x>=y){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
