import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_input = scan.nextLine();
    int ans = 0;
    int amari = 1;

    var str = str_input.split(" ");
    var L = Integer.parseInt(str[0]);
    var R = Integer.parseInt(str[1]);
    var d = Integer.parseInt(str[2]);

    for (var i = L; i <= R; i++) {
      amari = i % d;
      if ( amari == 0 ) {
        ans++;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}