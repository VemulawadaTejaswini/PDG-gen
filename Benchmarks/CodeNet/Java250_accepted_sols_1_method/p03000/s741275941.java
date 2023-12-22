import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int max = sc.nextInt();

    int jump = 1;
    int position = 0;
    for (int i = 0; i < n; i++) {
      int move = sc.nextInt();
      position += move;

      if(position <= max) {
        jump++;
      }
    }

    System.out.println(jump);
  }
}
