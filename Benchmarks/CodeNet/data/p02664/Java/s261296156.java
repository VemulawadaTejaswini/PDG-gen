import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.next();
    int n = t.length();
    String[] data = new String[n];

    int l = 0;

    String s = "";

    for (int i = 0; i < n; i++) {
      data[i] = t.substring(i,i+1);
      if (data[i].equals("?")) {
        data[i] = "D";
      }
      s += data[i];
    }

    // int count = 0;
    //
    // for (int i = 0; i < n; i++) {
    //   String k = s.substring(i,i+1);
    //   if (k.equals("D")) {
    //     count++;
    //   }
    // }
    //
    // for (int i = 0; i < n-1; i++) {
    //   String k = s.substring(i,i+2);
    //   if (k.equals("PD")) {
    //     count++;
    //   }
    // }

    System.out.println(s);

  }

}
