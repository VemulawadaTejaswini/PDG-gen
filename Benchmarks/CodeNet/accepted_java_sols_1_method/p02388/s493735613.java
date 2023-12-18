import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  // 標準入力からデータを読み込む準備
  Scanner sc = new Scanner(System.in);
  // 最初の文字の固まりを整数値と想定して読み込む
  int x = sc.nextInt();
  int answer = x*x*x /* ここを変えて3乗しよう! */;
  System.out.println(answer);
  }
 }
