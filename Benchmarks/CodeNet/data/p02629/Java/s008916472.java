
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 何匹目の犬であるか
    Long n = sc.nextLong();

    // 26の指数
    double x = Math.log(n) / Math.log(26);
    // 指数の整数部分
    int integerPart = (int)x;

    List<String> list = new ArrayList<>();
    list.add("z");
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    list.add("h");
    list.add("i");
    list.add("j");
    list.add("k");
    list.add("l");
    list.add("m");
    list.add("n");
    list.add("o");
    list.add("p");
    list.add("q");
    list.add("r");
    list.add("s");
    list.add("t");
    list.add("u");
    list.add("v");
    list.add("w");
    list.add("x");
    list.add("y");

    String[] ansArray = new String[integerPart + 1];
    for(int i = 0; i < integerPart + 1 ;i++) {
      long y = n % 26;
      ansArray[integerPart - i] = list.get((int) y);
      n = n/26;
    }
    String ans = String.join("", ansArray);

    System.out.println(ans);
  }
}
