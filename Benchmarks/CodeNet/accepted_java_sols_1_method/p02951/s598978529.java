import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 出力
        int o = c-a+b;
        System.out.println(o > 0 ? o : 0);
    }
}