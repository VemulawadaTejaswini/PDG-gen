import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int S = Integer.parseInt(sc.next());
      int W = Integer.parseInt(sc.next());
      
      String kotae = S <= W ? "unsafe" : "safe";
      System.out.println(kotae);
    }  
}
