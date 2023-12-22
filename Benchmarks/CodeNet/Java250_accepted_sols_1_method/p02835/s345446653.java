import java.util.*;

public class Main {
    public static void main(String args[]) {
       ///値を取得
       Scanner sc = new Scanner(System.in);
       int a1 = sc.nextInt();
       int a2 = sc.nextInt();
       int a3 = sc.nextInt();
       int sum = a1 + a2 + a3;
       
       //出力
       if(sum >= 22) {
           System.out.print("bust");
       } else if(sum <= 21) {
           System.out.print("win");
       }
    }
}