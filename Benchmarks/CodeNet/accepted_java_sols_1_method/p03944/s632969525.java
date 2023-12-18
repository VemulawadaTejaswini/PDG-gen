import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
        int xMax = w;
        int yMax = h;
        int xMin = 0;
        int yMin = 0;
        for(int i = 0; i < n; i++) {
          int x = sc.nextInt();
          int y = sc.nextInt();
          int a = sc.nextInt();
          switch (a) {
            case 1:
              if (x > xMin) {
                xMin = x;
              }
              break;
            case 2:
              if (x < xMax) {
                xMax = x;
              }
              break;
            case 3:
              if (y > yMin) {
                yMin = y;
              }
              break;
            case 4:
              if (y < yMax) {
                yMax = y;
              }
              break;
          }
        }
        w = xMax < xMin ? 0 : xMax - xMin;
        h = yMax < yMin ? 0 : yMax - yMin;
    
		// 出力
		System.out.println(w * h);
	}
}