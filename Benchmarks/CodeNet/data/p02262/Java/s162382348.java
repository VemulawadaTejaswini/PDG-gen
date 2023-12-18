import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int l = n / 9;
    List<Integer> m = new ArrayList<>();
    m.add(1);
    if(l > 3) {
      m.add(0, 4);
    }
    if(l > 12) {
      m.add(0, 13);
    }
    if(l > 39) {
      m.add(0, 40);
    }
    int count = 0;
    int v;
    int k;
    System.out.println(m.size());
    for(int i = 0; i < m.size(); i++) {
        if(i == m.size() - 1) {
          System.out.println(m.get(i));
        } else {
          System.out.print(m.get(i) + " ");
        }
        for(int j = m.get(i); j < n; j++)  {
          v = a[j];
          k = j - m.get(i);
          while(k >= 0 && a[k] > v) {
            a[k + m.get(i)] = a[k];
            k -= m.get(i);
            count++;
          }
          a[k + m.get(i)] = v;
        }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}

