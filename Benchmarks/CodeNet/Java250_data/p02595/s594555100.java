import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //　点の数
        double d = sc.nextInt(); // 比較する距離
      
      	double x, y; // 座標の点
      	double kyori = 0; // 原点から点までの距離
      	int count = 0; // D以下の距離の点の数
      
        for(int i = 0; i < n; i++) {
          x = sc.nextInt();
          y = sc.nextInt();

          // 原点からの距離を計算する
          kyori = Math.sqrt(x * x + y * y);

          // 原点からの距離がD以下ならカウントする
          if (kyori <= d) {
            count++;
          }
        }    
      System.out.println(count);   
    }
}