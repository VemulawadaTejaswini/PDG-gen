import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] marks = new int[n + 1];
    int[] distances = new int[n + 1];

    Arrays.fill(distances, -1);
    distances[1] = 0;

    ArrayList<Integer> toVList[] = new ArrayList[n + 1];
    for(int i = 0; i <= n; i++){
      toVList[i] = new ArrayList<>();
    }
    ArrayDeque<Integer> queue = new ArrayDeque<>();

    for(int i = 0; i < m; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      toVList[a].add(b);
      toVList[b].add(a);
    }
    queue.add(1);
    while(!queue.isEmpty()) {
      Integer v = queue.pollFirst();
      ArrayList<Integer> list = toVList[v.intValue()];
      for(Integer to_v : list){
        if(distances[to_v.intValue()] == -1){
          distances[to_v.intValue()] = distances[v.intValue()] + 1;
          marks[to_v.intValue()] = v.intValue();
          queue.add(to_v);
        }
      }
    }
    System.out.println("Yes");
    for(int i = 2; i <= n; i++){
      System.out.println(marks[i]);
    }
  }
}