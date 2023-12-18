import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    //標準入力システム
        int x = sc.nextInt();  //入力呼び出し
        int h,m,s;
        h = x / 3600;
        m = (x-h*3600) / 60;
        s = x-h*3600-m*60;
        
        System.out.println(h +":"+ m +":"+ s);  
    }
}
