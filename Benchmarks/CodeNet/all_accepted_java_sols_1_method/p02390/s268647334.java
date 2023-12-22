import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
       Scanner sc = new Scanner(System.in);
       
       //入力値の受け取り
       int n = sc.nextInt();
       
       //計算して出力
       
        //時間
        System.out.print(n/3600);
        System.out.print(":");
        //分
        System.out.print((n%3600)/60);
        System.out.print(":");
        //秒
        System.out.println((n%3600)%60);
    }
}
