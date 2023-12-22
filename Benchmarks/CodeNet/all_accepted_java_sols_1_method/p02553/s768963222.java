import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        //最大値を格納する変数ans
        long ans = a * c;
        if(a * d > ans){
            ans = a * d;
        }
        if(b * c > ans){
            ans = b * c;
        }
        if(b * d > ans){
            ans = b * d;
        }
        //ansを出力する
        System.out.println(ans);
    }
}