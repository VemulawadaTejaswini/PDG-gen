import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> a = new ArrayList<>();
    Map<Integer, Integer> b = new HashMap<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }
    SortedSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      int j = sc.nextInt();
      set.add(j);
      Integer integer = b.get(j);
      if (integer == null ) {
        integer = 0;
      }
      b.put(j, integer + 1);
    }
    List<Integer> newB = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int ai = a.get(i);
      SortedSet<Integer> firstSet = set.headSet(ai);
      SortedSet<Integer> endSet = set.tailSet(ai);
      endSet.remove(ai);
      if (firstSet.isEmpty() && endSet.isEmpty()) {
        System.out.println("No");
        return;
      }
      int bi;
      if (firstSet.isEmpty()) {
        bi = endSet.first();
      } else {
        bi = firstSet.first();
      }
      newB.add(bi);
      int count = b.get(bi);
      count--;
      b.put(bi, count);
      if (count == 0) {
        set.remove(bi);
      }
    }
    System.out.println("Yes");
    for (int i = 0, len = n - 1; i < len; i++) {
      System.out.print(newB.get(i));
      System.out.print(" ");
    }
    System.out.println(newB.get(n-1));
  }
}
