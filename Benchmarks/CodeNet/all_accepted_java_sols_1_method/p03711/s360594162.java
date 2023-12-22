import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] aGroup = {1,3,5,7,8,10,12};
    int[] bGroup = {4,6,9,11};
    int[] cGroup = {2};
    String xGroup = "x";
    String yGroup = "y";

    for (int i = 0; i < 7; i++) {
      if (aGroup[i] == x) {
        xGroup = "a";
      }
      if (aGroup[i] == y) {
        yGroup = "a";
      }
    }

    for (int i = 0; i < 4; i++) {
      if (bGroup[i] == x) {
        xGroup = "b";
      }
      if (bGroup[i] == y) {
        yGroup = "b";
      }
    }

    if ((x == 2) && (y == 2)) {
      xGroup = "c";
      yGroup = "c";
    }

    if (xGroup.equals(yGroup)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}