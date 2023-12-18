import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    //標準入力システム
        int x = sc.nextInt();  //入力呼び出し
        int y = sc.nextInt();
        int size = x*y;
        int per = 2*(x+y);
        System.out.println(size +" "+ per);  //出力
    }
}

