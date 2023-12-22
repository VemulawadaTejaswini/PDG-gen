import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str;
    int num;
    boolean[] S = new boolean[13];
    boolean[] H = new boolean[13];
    boolean[] C = new boolean[13];
    boolean[] D = new boolean[13];

    for (int i = 0; i < 13; i++)
      S[i] = H[i] = C[i] = D[i] = false;

    for (int i = 0; i < n; i++) {
      str = sc.next();
      num = sc.nextInt();
      if (str.equals("S"))
        S[num - 1] = true;
      else if (str.equals("H"))
        H[num - 1] = true;
      else if (str.equals("C"))
        C[num - 1] = true;
      else if (str.equals("D"))
        D[num - 1] = true;
    }

    for (int i = 0; i < 13; i++)
      if (!S[i])
        System.out.println("S" + " " + (i + 1));
    for (int i = 0; i < 13; i++)
      if (!H[i])
        System.out.println("H" + " " + (i + 1));
    for (int i = 0; i < 13; i++)
      if (!C[i])
        System.out.println("C" + " " + (i + 1));
    for (int i = 0; i < 13; i++)
      if (!D[i])
        System.out.println("D" + " " + (i + 1));
  }
}