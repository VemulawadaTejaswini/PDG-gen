import java.util.*;
public class Payment {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                // 整数の入力
                int n = sc.nextInt();
                // 出力
                System.out.println(1000-(n%1000));
        }
}