import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        // 出力
        if(n < 10){
            System.out.println(n);
            return;
        }
        if(n < 100){
            System.out.println(9);
            return;
        }
        if(n < 1000){
            System.out.println(n-90);
            return;
        }
        if(n < 10000){
            System.out.println(909);
            return;
        }
        if(n < 100000) {
            System.out.println(n - 10000 + 910);
            return;
        }
        System.out.println(90909);
    }
}
