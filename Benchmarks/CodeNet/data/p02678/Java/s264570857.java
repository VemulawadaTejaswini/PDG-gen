import java.util.*;

public class Main {
  static int m;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    m = sc.nextInt();
    ArrayList<Road> roads = new ArrayList<>();
    int res[] = new int[n];
    Arrays.fill(res, -1);
    LinkedList<Integer> nexts = new LinkedList<>();
    nexts.add(1);
    for (int i = 0; i < m; i++) {
      roads.add(new Road(sc.nextInt(), sc.nextInt()));
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

  static void point(int to, ArrayList<Road> roads, int array[], LinkedList<Integer> nexts) {
    int size = roads.size();
    ArrayList<Integer> remInd = new ArrayList<>();
    for (int i = 0; i < size; i ++) {
      if (roads.get(i).a == to && array[roads.get(i).b-1] == -1 && roads.get(i).b != 1) {
        array[roads.get(i).b-1] = to;
        nexts.add(roads.get(i).b);
        remInd.add(i);
      } else if (roads.get(i).b == to && array[roads.get(i).a-1] == -1 && roads.get(i).a != 1) {
        array[roads.get(i).a-1] = to;
        nexts.add(roads.get(i).a);
        remInd.add(i);
      }
    }
    int size2 = remInd.size()
    for (int i = 0; i < size2; i++) {
      roads.remove(remInd.get(i) - i);
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