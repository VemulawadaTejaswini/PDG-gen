import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < 1; i = 0) {
      String line = sc.nextLine();
      String[] l = line.split(" ");
      int m = Integer.parseInt(l[0]);
      int f = Integer.parseInt(l[1]);
      int r = Integer.parseInt(l[2]);

      if(m == -1 && f == -1 && r == -1) {
        break;
      }

      char c = 0;
      if(m == -1 || f == -1) {
        c = 'F';
      } else if(m + f >= 80) {
        c = 'A';
      } else if(m + f >= 65) {
        c = 'B';
      } else if(m + f >= 50) {
        c = 'C';
      } else if(m + f >= 30) {
        if(r >= 50) {
          c = 'C';
        } else {
          c = 'D';
        }
      } else {
        c = 'F';
      }

      System.out.println(c);
    }
  }
}