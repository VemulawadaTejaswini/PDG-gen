import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    // 準備
    // A~Zを配列(c_ans)に設定
    char[] c_ans = new char[26];
    for(int i=0; i<26; ++i)
      c_ans[i] = (char)('A'+i);

    // 解く
    // c_ans[]に A~Zを0~25 に変換したものを設定し出力する方針
    char[] c = new char[s.length()];
    for(int i=0; i<s.length(); ++i) {

      // 入力sを一文字ずつ「0~25」の値に変換
      c[i] = s.charAt(i);
      int c_num = c[i] - 'A' + n;
      if(c_num > 25) c_num = c_num-26; // 26以上になったらマイナス26。26番目=0番目, 27番目=1番目...

      // 出力
      System.out.print(c_ans[c_num]);
    }
  }
}
// b問題だから弱いと思ったけど、強かった。