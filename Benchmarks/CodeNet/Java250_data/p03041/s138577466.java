import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    String[] mozi = new String [n];

    int k = sc.nextInt();
    String i = mozi[k - 1];


    String s = sc.next();

    String ans = "";
    for (int y = 0; y < n; y++) {
      if (y == k - 1) {
        ans += String.valueOf(s.charAt(y)).toLowerCase();
      }
      else {
        ans += String.valueOf(s.charAt(y));
      }
    }

    System.out.println(ans);


	}
}
