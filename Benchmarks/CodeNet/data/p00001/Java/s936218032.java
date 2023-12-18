import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> heights = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      int val = sc.nextInt();
      heights.add(val);
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (heights.get(i) > heights.get(j)) {
          int tmp = heights.get(i);
          heights.set(i, heights.get(j));
          heights.set(j, tmp);
        }
      }
    }

    for (int i = 0; i < 3; i++) {
      System.out.println(heights.get(i));
    }
  }
}