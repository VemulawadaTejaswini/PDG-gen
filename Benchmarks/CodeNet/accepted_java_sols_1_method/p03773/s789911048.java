import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();


        int total = a+b;
        if(total>=24){
            total=total-24;
        }
        // 出力
        System.out.println(total);
    }
}