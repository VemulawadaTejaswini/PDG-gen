import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    // 準備
    int ac = 0;
    int pena = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] p = new int[m];
    String[] s = new String[m];

    int[] submit = new int[n+1];
    int[] wa = new int[n+1];
    Arrays.fill(submit, 0);
    Arrays.fill(wa, 0);

    for(int i=0; i<m; ++i) {
      p[i] = sc.nextInt();
      s[i] = sc.next();
    }

    for(int i=0; i<m; ++i) {
      if(submit[p[i]] == 0 && s[i].equals("WA")) {
        ++wa[p[i]];
      }

      if(submit[p[i]] == 0 && s[i].equals("AC")) {
        submit[p[i]] = 1;
        ++ac;
        pena += wa[p[i]];
      }
    }
    System.out.println(ac +" "+pena);

  }
}