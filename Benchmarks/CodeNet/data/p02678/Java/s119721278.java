import java.util.*;

public class Main {
  static int m;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    m = sc.nextInt();
    Road roads[] = new Road[m];
    int res[] = new int[n];
    Arrays.fill(res, -1);
    LinkedList<Integer> nexts = new LinkedList<>();
    nexts.add(1);
    for (int i = 0; i < m; i++) {
      roads[i] = new Road(sc.nextInt(), sc.nextInt());
    }
    while (nexts.size() != 0) {
      point(nexts.poll(), roads, res, nexts);
    }
    for (int i = 1; i < n; i ++) {
      if (res[i] == -1) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
    for (int i = 1; i < n; i++)  {
      System.out.println(res[i]);
    }
    sc.close();
  }

  static void point(int to, Road roads[], int array[], LinkedList<Integer> nexts) {
    for (int i = 0; i < m; i ++) {
      if (roads[i].a == to && array[roads[i].b-1] == -1 && roads[i].b != 1) {
        array[roads[i].b-1] = to;
        nexts.add(roads[i].b);
      } 
      if (roads[i].b == to && array[roads[i].a-1] == -1 && roads[i].a != 1) {
        array[roads[i].a-1] = to;
        nexts.add(roads[i].a);
      }
    }
  }

  static class Road {
    int a, b;
    Road (int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}