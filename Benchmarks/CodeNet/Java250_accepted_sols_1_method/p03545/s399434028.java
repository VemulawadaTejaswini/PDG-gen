import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String abcd = sc.next();
    sc.close();

    String[] ABCD = abcd.split("");

    String result = "";
    
    int[] ans = new int[8];

    ans[0] = Integer.valueOf(ABCD[0]) + Integer.valueOf(ABCD[1]) + Integer.valueOf(ABCD[2]) + Integer.valueOf(ABCD[3]);
    ans[1] = Integer.valueOf(ABCD[0]) + Integer.valueOf(ABCD[1]) + Integer.valueOf(ABCD[2]) - Integer.valueOf(ABCD[3]);
    ans[2] = Integer.valueOf(ABCD[0]) + Integer.valueOf(ABCD[1]) - Integer.valueOf(ABCD[2]) + Integer.valueOf(ABCD[3]);
    ans[3] = Integer.valueOf(ABCD[0]) + Integer.valueOf(ABCD[1]) - Integer.valueOf(ABCD[2]) - Integer.valueOf(ABCD[3]);
    ans[4] = Integer.valueOf(ABCD[0]) - Integer.valueOf(ABCD[1]) - Integer.valueOf(ABCD[2]) - Integer.valueOf(ABCD[3]);
    ans[5] = Integer.valueOf(ABCD[0]) - Integer.valueOf(ABCD[1]) - Integer.valueOf(ABCD[2]) + Integer.valueOf(ABCD[3]);
    ans[6] = Integer.valueOf(ABCD[0]) - Integer.valueOf(ABCD[1]) + Integer.valueOf(ABCD[2]) - Integer.valueOf(ABCD[3]);
    ans[7] = Integer.valueOf(ABCD[0]) - Integer.valueOf(ABCD[1]) + Integer.valueOf(ABCD[2]) + Integer.valueOf(ABCD[3]);

    if (ans[0] == 7) { result = ABCD[0] + "+" + ABCD[1] + "+" + ABCD[2] + "+" + ABCD[3] + "=7"; }
    if (ans[1] == 7) { result = ABCD[0] + "+" + ABCD[1] + "+" + ABCD[2] + "-" + ABCD[3] + "=7"; }
    if (ans[2] == 7) { result = ABCD[0] + "+" + ABCD[1] + "-" + ABCD[2] + "+" + ABCD[3] + "=7"; }
    if (ans[3] == 7) { result = ABCD[0] + "+" + ABCD[1] + "-" + ABCD[2] + "-" + ABCD[3] + "=7"; }
    if (ans[4] == 7) { result = ABCD[0] + "-" + ABCD[1] + "-" + ABCD[2] + "-" + ABCD[3] + "=7"; }
    if (ans[5] == 7) { result = ABCD[0] + "-" + ABCD[1] + "-" + ABCD[2] + "+" + ABCD[3] + "=7"; }
    if (ans[6] == 7) { result = ABCD[0] + "-" + ABCD[1] + "+" + ABCD[2] + "-" + ABCD[3] + "=7"; }
    if (ans[7] == 7) { result = ABCD[0] + "-" + ABCD[1] + "+" + ABCD[2] + "+" + ABCD[3] + "=7"; }

    System.out.println(result);

  }

}