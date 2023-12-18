import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); //回数
    int cnt = 0; //連続ぞろ目
    boolean judge = false; //判定

    for (int i = 0; i < num ;i++) {
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();
      cnt = (a1 == a2) ? cnt++ : 0;
      if (cnt == 3) {judge = true;}
    }
    String disp = judge ? "Yes" : "No";
    System.out.println(disp);
    sc.close();


  }
}
