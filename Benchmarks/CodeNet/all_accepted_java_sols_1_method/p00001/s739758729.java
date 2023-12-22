import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 入力をもらうための変数を用意
    Scanner s = new Scanner(System.in);
    // 10こ分の配列
    int[] inputs = new int[10];

    for (int i = 0; i < 10; i++) {
    // 入力されたものをinputに入れる
      inputs[i] = s.nextInt();
    }   

    Arrays.sort(inputs);

    // 出力
    System.out.println(inputs[9]);
    System.out.println(inputs[8]);
    System.out.println(inputs[7]);
  }
}