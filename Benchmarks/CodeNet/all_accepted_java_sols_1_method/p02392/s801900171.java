import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
       Scanner sc = new Scanner(System.in);
       
       //入力値の受け取り
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       
       
       //計算して出力
        if (a < b && b < c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
