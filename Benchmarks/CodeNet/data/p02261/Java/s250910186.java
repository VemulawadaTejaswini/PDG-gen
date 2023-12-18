import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<List<String>> bubble = new ArrayList<>();
    List<List<String>> select = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      List<String> list = Arrays.asList(sc.next().split(""));
      bubble.add(list);
      select.add(list);
    }
    for(int i = 0; i < n; i++) {
      for(int j = n - 1; j > i; j--) {
        int k = Integer.parseInt(bubble.get(j).get(1));
        int l = Integer.parseInt(bubble.get(j - 1).get(1));
        if(k < l) {
          List<String> v = bubble.get(j);
          bubble.set(j, bubble.get(j - 1));
          bubble.set(j - 1, v);
        }
      }
      if(i == n - 1) {
        System.out.println(bubble.get(i).get(0) + bubble.get(i).get(1));
        System.out.println("Stable");
      } else {
        System.out.print(bubble.get(i).get(0) + bubble.get(i).get(1) + " ");
      }
    }
    boolean stable = true;
    for(int i = 0; i < n; i++) {
      int min = i;
      for(int j = i; j < n; j++) {
        int k = Integer.parseInt(select.get(j).get(1));
        int l = Integer.parseInt(select.get(min).get(1));
        if(k < l) {
          min = j;
        }
      }
      List<String> v = select.get(i);
      select.set(i, select.get(min));
      select.set(min, v);
      String bub = select.get(i).get(0) + select.get(i).get(1);
      String sel = select.get(i).get(0) + select.get(i).get(1);
      if(bub.equals(sel)) {
        stable = false;
      }
      if(i == n - 1) {
        System.out.println(select.get(i).get(0) + select.get(i).get(1));
        if(stable) {
          System.out.println("Stable");
        } else {
          System.out.println("Not stable");
        }
      } else {
        System.out.print(select.get(i).get(0) + select.get(i).get(1) + " ");
      }
    }
  }
}

