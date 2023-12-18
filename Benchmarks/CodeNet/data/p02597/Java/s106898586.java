import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] c = sc.next().toCharArray();
    int WL = 0;
    int RL = 0;
    int R = 0;
    boolean a = c[0] == 'W';
    boolean b = true;
    for (int i = 0; i < N; i++) {
      if (a) {
        if (c[i] != 'W') {
          a = false;
        } else {
          WL++;
        }
      }
      if (!a && b) {
        if (c[i] != 'R') {
          b = false;
        } else {
          RL++; 
        }
      }
      if (c[i] == 'R') R++;

    }

    System.out.println(WL > (R-RL) ? R : R-RL);
  }
}