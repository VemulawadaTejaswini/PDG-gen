
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = 0;
    for(int i = 0;i < 5 ; i++) {
      if(sc.nextInt() == 0) {
        cnt = i + 1;
        break;
      }
    }
    System.out.println(cnt);
  }

}
