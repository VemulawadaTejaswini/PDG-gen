import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();

    int S_len = S.length();
    int T_len = T.length();

    int same_char = 0;
    int longlen = 0;
    int ans = 0;
    int k = 0;

    int hikaku_len = S_len - T_len + 1;

    for (var i = 0;i<hikaku_len;i++){
      same_char = 0;
      k = i;
      for (var j = 0;j < T_len;j++){
        if ( S.charAt(k) == T.charAt(j) ) {
          same_char++;
        }
        k++;
      }
      if (longlen < same_char){
        longlen = same_char;
      }
    }

    ans = T_len - longlen;

    System.out.println(ans);
    scan.close();
  }
}