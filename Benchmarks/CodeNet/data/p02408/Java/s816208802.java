import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        int[][] flag = new int[4][13];
        for(int i = 0; i < n; i++) {
          line = sc.nextLine();
          String[] l = line.split(" ");

          int D = 0;
          if(l[0].equals("S")) {
            D = 0;
          } else if(l[0].equals("H")) {
            D = 1;
          } else if(l[0].equals("C")) {
            D = 2;
          } else if(l[0].equals("D")) {
            D = 3;
          }

          int N = Integer.parseInt(l[1]) - 1;

          flag[D][N] = 1;
        }

        for(int i = 0; i < 4; i++) {
          for(int j = 0; j < 13; j++) {

            String DD = "";
            if(flag[i][j] != 1) {

              if(i == 0) {
                DD = "S";
              } else if(i == 1) {
                DD = "H";
              } else if(i == 2) {
                DD = "C";
              } else if(i == 3) {
                DD = "D";
              }

              int J = j + 1;
              System.out.println(DD + " " + J);
            }
          }
        }
    }
}