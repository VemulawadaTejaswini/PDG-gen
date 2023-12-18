import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * D - .. (Double Dots)
 * <p>
 * https://atcoder.jp/contests/abc168/tasks/abc168_d
 */

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    ArrayDeque<Integer> vQueue = new ArrayDeque<>();
    List<Integer> toVList[] = new ArrayList[n + 1];
    int[] distance = new int[n + 1];
    int[] marks = new int[n + 1];
    Arrays.fill(distance, -1);
    distance[0] = 0;
    distance[1] = 0;

    for (int i = 0; i < m; i++) {
      String[] atob = sc.nextLine().split(" ");
      int a = Integer.parseInt(atob[0]);
      int b = Integer.parseInt(atob[1]);
      if(toVList[a] == null){
        toVList[a] = new ArrayList<Integer>();
      }
      toVList[a].add(b);

      if(toVList[b] == null){
        toVList[b] = new ArrayList<Integer>();
      }
      toVList[b].add(a);
    }
    vQueue.add(1);
    while (!vQueue.isEmpty()) {
      Integer v = vQueue.pollFirst();
      List<Integer> nextVList = toVList[v.intValue()];
      for (Integer nextV : nextVList) {
        if(distance[nextV.intValue()] == -1) {
          distance[nextV.intValue()] = distance[v.intValue()] + 1;
          marks[nextV.intValue()] = v.intValue();
          vQueue.addLast(nextV);
        }
      }
    }
    System.out.println("Yes");
    for (int i = 2; i < marks.length; i++) {
      System.out.println(marks[i]);
    }
  }
}