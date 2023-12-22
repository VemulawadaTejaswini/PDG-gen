import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line;

        while(!((line = sc.nextLine()).equals("-"))) {
          char[] c = line.toCharArray();

          line = sc.nextLine();
          int m = Integer.parseInt(line);

          for(int ii = 0; ii < m; ii++) {
              line = sc.nextLine();

              int h = Integer.parseInt(line);
              char z = 0;

              for(int I = 0; I < h; I++) {
                z = c[0];
                for(int i = 0; i < c.length - 1; i++) {
                  c[i] = c[i + 1];
                }
                c[c.length - 1] = z;
              }

          }

          System.out.println(String.valueOf(c));

        }
    }
}