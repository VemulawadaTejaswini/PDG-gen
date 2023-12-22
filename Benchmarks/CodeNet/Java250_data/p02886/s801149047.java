import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer> d = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
      d.add(sc.nextInt());
    }
    
    int c = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        c += d.get(i) * d.get(j);
      }
    }
    System.out.println(c);
  }
}