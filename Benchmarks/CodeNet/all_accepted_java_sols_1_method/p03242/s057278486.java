import java.util.*;

public class Main {

  public static void main (String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    int [] s = new int [n];

    s[2] = n % 10; n /= 10;
    s[1] = n % 10; n /= 10;
    s[0] = n % 10;

    for(int i = 0; i < 3; i ++){
      if (s[i] == 1){
        s[i] = 9;
      } else {
        s[i] = 1;
      }
    }
    int goal = 100 * s[0] + 10 * s[1] + s[2];



    System.out.println(goal);

  }
}
