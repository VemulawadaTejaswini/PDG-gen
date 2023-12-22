import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = Integer.parseInt(sc.next());
    int Y = Integer.parseInt(sc.next());
    int total = 0;

    if(X == 3)
      total += 100000;
    if(Y == 3)
      total += 100000;
    if(X == 2)
      total += 200000;
    if(Y == 2)
      total += 200000;
    if(X == 1)
      total += 300000;
    if(Y == 1)
      total += 300000;
    if(X == 1 && Y == 1)
      total += 400000;

    System.out.println(total);
  }
}