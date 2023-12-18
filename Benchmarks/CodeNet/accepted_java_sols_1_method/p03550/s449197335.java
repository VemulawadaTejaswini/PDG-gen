import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // カードの枚数
    int z = sc.nextInt(); // Xの初期カード
    int w = sc.nextInt(); // Yの初期カード
    int[] card = new int[N]; // N枚の山札カード
    int score; // スコア
    for(int i = 0; i < N; i++) {
      card[i] = sc.nextInt();
    }

    if(N == 1) {
      score = Math.abs(card[0] - w);
      System.out.println(score);
    } else {
      score = Math.max(Math.abs(card[N - 1] - w), Math.abs(card[N - 2] - card[N - 1]));
      System.out.println(score);
    }
  }
}
