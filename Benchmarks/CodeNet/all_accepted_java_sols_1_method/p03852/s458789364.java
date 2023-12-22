import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String c = scanner.next();

    // 母音か子音かを判定する（a, i, u, e, oのどれかなら母音）
    // 母音なら"vowel"、子音なら"consonant"
    // *データ型どうしの比較は「==」
    // *オブジェクトどうしの比較は「.equals」
    if(c.equals("a") || c.equals("i") || c.equals("u")
       || c.equals("e") || c.equals("o")) {
      System.out.println("vowel");
    } else {
      System.out.println("consonant");
    }
  }
}