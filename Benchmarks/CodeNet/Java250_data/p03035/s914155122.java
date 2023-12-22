import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 年齢
        int old = sc.nextInt();
        // 料金
        int price = sc.nextInt();
        price = old>12? price: 5<old && old<=12? price/2: 0;
        // 出力
        System.out.println(price);
    }
}