import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      double Hankei = Double.parseDouble(sc.next());
      double Syutyo = 0;
      double pai = Math.PI;

      Syutyo = 2.0 * Hankei * pai;
      System.out.println(Syutyo);
    }
    
}
