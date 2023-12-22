import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = (int)Math.pow(N,3); //順列
      
        //出力
        System.out.println(answer);
    }
}