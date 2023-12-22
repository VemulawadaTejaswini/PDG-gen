import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String num_scan = scan.nextLine();
    String box_scan = scan.nextLine();
    int ans = 0;
    int chk_num = 0;
    int chk_box = 0;

    var num = Integer.parseInt(num_scan);
    var box = box_scan.split(" ");

    for (var i = 1; i <= num; i++){
      chk_num = i % 2;
      chk_box = Integer.parseInt(box[i-1]) % 2;
      if ((chk_num == 1) && (chk_box == 1)) {
        ans++;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}