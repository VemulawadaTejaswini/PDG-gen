import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int ans = 0;

    // 解き方汚いけど分からないからごり押し
    for(int i=(int)n; i>=0; --i) {
      if((int)(i*1.08) == n) {
        ans = i;
      }
    }

    // 出力
    if(ans != 0)
      System.out.println(ans);
    else
      System.out.println(":(");

  }
}