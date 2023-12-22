import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r=(2*a-1)>(2*b-1)?(2*a-1):(2*b-1);
        r=r>(a+b)?r:(a+b);
        // 出力
        System.out.println(r);
    }
}