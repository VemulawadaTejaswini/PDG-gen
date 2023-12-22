import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int x;
    String e, str;
    int card[] = new int[52];
    for (int i = 0; i < 52; i++) {
      card[i] = 0;
    }
    int n = Integer.parseInt(buf.readLine());
    for (int i = 0;i < n; i++) {
      str = buf.readLine();
      e = str.split(" ", 0)[0];
      x = Integer.parseInt(str.split(" ", 0)[1]);
      if (e.equals("S")) {
        card[x-1] = 1;
      } else if (e.equals("H")) {
        card[x+12] = 1;
      } else if (e.equals("C")) {
        card[x+25] = 1;
      } else {
        card[x+38] = 1;
      }
    }
    for (int i = 0; i < 52; i++) {
      if (card[i] == 0) {
        if (i < 13) {
          str = String.valueOf(i+1);
          System.out.println("S "+str);
        } else if (i < 26) {
          str = String.valueOf(i-12);
          System.out.println("H "+str);
        } else if (i < 39) {
          str = String.valueOf(i-25);
          System.out.println("C "+str);
        } else {
          str = String.valueOf(i-38);
          System.out.println("D "+str);
        }
      }
    }
  }
}