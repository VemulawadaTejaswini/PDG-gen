import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "Yes";

    // 配列は0から始まってるから1文字目が「i=0」になる。
    // 感覚的に添え字と偶奇が逆になる。ややこしや。
    for(int i=0; i<s.length(); ++i) {
      if(i%2 == 0 && s.charAt(i)=='L')
        ans = "No";
      if(i%2 == 1 && s.charAt(i)=='R')
        ans = "No";
    }

    System.out.println(ans);
  }
}