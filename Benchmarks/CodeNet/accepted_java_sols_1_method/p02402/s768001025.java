import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    ArrayList<Integer> nth = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      nth.add(a);
      sum += nth.get(i);
    }
    int min = nth.get(0);
    for (int i = 1; i < n; i++) {
      min = Math.min(min, nth.get(i));
    }
    int max = nth.get(0);
    for (int i = 1; i < n; i++) {
      max = Math.max(max, nth.get(i));
    }

    System.out.println(min + " " + max + " " + sum);

    sc.close();
  }
}

