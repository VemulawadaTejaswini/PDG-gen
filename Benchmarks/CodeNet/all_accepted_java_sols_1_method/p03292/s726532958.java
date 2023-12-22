import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      Integer[] list = new Integer[3];
      list[0] = sc.nextInt();
      list[1] = sc.nextInt();
      list[2] = sc.nextInt();
      Arrays.sort(list, Collections.reverseOrder());
      int cost = 0;
      int pre = list[0];
      for (int i = 1; i < list.length; i++) {
        cost += pre - list[i];
        pre = list[i];
      }
      System.out.println(cost);
    }
  }
}
