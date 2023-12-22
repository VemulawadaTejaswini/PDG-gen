import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // 初期ポイント
    int k = sc.nextInt();
    int q = sc.nextInt();

    int[] player = new int[n];

    for(int i = 0; i < q; i++){
      int tmp = sc.nextInt();
      player[tmp - 1]++;
    }
    for(int i = 0; i < n; i++){
      // int point = k - (q - player[i]);
      int point =  player[i] + k - q;
      if(point > 0){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
