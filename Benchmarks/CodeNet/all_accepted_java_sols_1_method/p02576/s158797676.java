import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var N = Integer.parseInt(str[0]);
    var X = Integer.parseInt(str[1]);
    var T  = Integer.parseInt(str[2]);
    int ans = 0;

    var amari = N % X;
    var syou = N / X;

    if (amari > 0){
      ans = T * (syou + 1);
    }else{
      ans = T * syou;
    }

    System.out.println(ans);
    scan.close();
  }
}