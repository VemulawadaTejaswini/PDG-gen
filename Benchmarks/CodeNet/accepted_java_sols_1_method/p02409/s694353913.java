import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        int[][][] log = new int[4][3][10];
        for(int i = 0; i < n; i++) {
          line = sc.nextLine();
          String[] l = line.split(" ");

          int b = Integer.parseInt(l[0]) - 1;
          int f = Integer.parseInt(l[1]) - 1;
          int r = Integer.parseInt(l[2]) - 1;
          int v = Integer.parseInt(l[3]);

          log[b][f][r] += v;
        }

        for(int b = 0; b < 4; b++) {
          for(int f = 0; f < 3; f++) {
            for(int r = 0; r < 10; r++) {
              System.out.print(" " + log[b][f][r]);
            }
            System.out.println();
          }
          if(b != 3) {
            System.out.println("####################");
          }
        }
    }
}