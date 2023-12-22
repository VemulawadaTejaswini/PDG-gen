import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int t = 0;
      	int x = 0;
      	int y = 0;
 
      for (int i=0; i<N; i++) {
        int T = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int dt = T - t;
        int dist = Math.abs(X - x) + Math.abs(Y - y);
        if ((dist > dt) || ((dist - dt) % 2 != 0)) {
          System.out.println("No");
          return;
        }
        //移動した場所を設定
        t = T;
        x = X;
        y = Y;
      }
      System.out.println("Yes");
    }
}