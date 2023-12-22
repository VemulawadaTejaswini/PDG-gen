import java.util.*;

public class Main {

  public static void main (String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    int t = stdIn.nextInt();
    int c, t_1;
    int count = 0;
    int min = 2147483647;

    for(int i = 0; i < n; i++){
      c = stdIn.nextInt();
      t_1 = stdIn.nextInt();

      if (t_1 <= t){
        count++;
        if(c < min) {
          min = c;
        }
      } else {
        continue;
      }

    }

    if (count == 0) {
      System.out.println("TLE");
    } else {
      System.out.println(min);
    }


  }
}