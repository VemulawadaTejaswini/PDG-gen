import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int r = Integer.parseInt(l[0]);
        int c = Integer.parseInt(l[1]);

        int[] SUM = new int[c];
        for(int i = 0; i <= r; i++) {

          int sum = 0;

          if(i != r) {
            line = sc.nextLine();
            String[] L = line.split(" ");

            for(int j = 0; j < c; j++) {
              int C = Integer.parseInt(L[j]);
              System.out.print(C + " ");
              sum += C;
              SUM[j] += C;
            }
          }

          if(i == r) {
            for(int j = 0; j < c; j++) {
              int C = SUM[j];
              System.out.print(C + " ");
              sum += C;
            }
          }

          System.out.println(sum);
        }
    }
}