
import java.util.Scanner;


public class Main {

  public static void main(String [] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int q = s.nextInt();

    int[] outputs = new int[q];

    String str = s.next();

    int[] acs = new int[n];
    acs[0] = 0;

    for (int i = 1; i < n; i ++) {
      if (str.substring(i - 1, i + 1).equals("AC"))
        acs[i] = acs[i - 1] + 1;
      else
        acs[i] = acs[i - 1];
    }

    for (int i = 0; i < q; i ++) {
      int l = s.nextInt();
      int r = s.nextInt();
      outputs[i] = acs[r - 1] - acs[l - 1];
    }

    for (int i : outputs)
      System.out.println(i);

  }

}