import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	//入力
        int x = sc.nextInt();
      	//入力が「1」の場合
        if (x == 1) {
            System.out.println(1);
            return;
        }
        int max = 1;
        for (int i = 2; i <= x; i++) {
          	//※Math.pow(i, j)は「iのj乗」
            for (int j = 2; (int)Math.pow(i, j) <= x; j++) {
            //最大値を出力  
              max = Math.max(max, (int)Math.pow(i, j));
            }
        }
        System.out.println(max);
    }
}