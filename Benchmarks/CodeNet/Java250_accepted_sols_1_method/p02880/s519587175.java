import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.close();

    int tmp_ans = 0;
    boolean flg_ans = false;
    for(int i=1; i<=9; i++) {
      tmp_ans = N/i;
      if(N%i == 0 && 1 <= tmp_ans && tmp_ans <= 9) {
        flg_ans = true;
        break;
      }
    }

    System.out.println(flg_ans ? "Yes" : "No");
  }
}