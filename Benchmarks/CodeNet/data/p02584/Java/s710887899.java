import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] strs = str.split(" ");
    long x = Long.parseLong(strs[0]); // 今いる
    long k = Long.parseLong(strs[1]); // 回数
    long d = Long.parseLong(strs[2]); // 変動量

    boolean isMinus = x <= 0;
    while (x!= 0 && k!=0 && isMinus == (x <= 0) ){
      x = x + (isMinus? 1 : -1) * d;
      k--;
    }

    if (k ==0) System.out.println(Math.abs(x));
    else System.out.println(Math.abs(x + (isMinus? -1 : 1) * d * k % 2));
  }
}
