import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // スペース区切りの整数の入力
        int a = sc.nextInt();
        int h = (a / 60)/ 60;
        int m = a % 3600 / 60;
        int s = a % 60;

        // 出力
        // System.out.println(a);
        System.out.println(h+":"+m+":"+s);
        // System.out.println(m);
        // System.out.println(s);

    }
}
