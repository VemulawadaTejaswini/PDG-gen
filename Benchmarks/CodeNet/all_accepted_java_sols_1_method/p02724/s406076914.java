import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int upThousand = X / 500;
    int upFive = (X -= 500 * (upThousand)) / 5;
    System.out.println((upThousand * 1000 ) + (upFive * 5));
  }
 }