import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の数
    int n = sc.nextInt();
    // 整数のリスト
    int[] list = new int[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextInt();
    }
    // リストをソート
    Arrays.sort(list);
    // 始めの4つの要素だけ考えればいい
    int n2 = 4;
    if (n < 4){
        n2 = n;
    }
    int n3 = n2 * (n2 - 1);
    int[] list2 = new int[n3];
    int i = 0;
    for(int i1 = 0; i1 < n2; i1++){
      for(int i2 = 0; i2 < n2; i2++){
        String x1 = String.valueOf(list[i1]);
        String x2 = String.valueOf(list[i2]);
        String newX = x1 + x2;
        list2[i] = Integer.parseInt(newX);
        i = i + 1;
      }
    }
    sc.close();
  }
}

