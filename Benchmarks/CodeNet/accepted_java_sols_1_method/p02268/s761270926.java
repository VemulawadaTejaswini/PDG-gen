import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] s = new int[n];
    for(int i = 0; i < n; i++) {
      s[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    List<Integer> t = new ArrayList<>();
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt();
      if(!t.contains(a)) {
        t.add(a);
      }
    }
    int count = 0;
    loop: for(int i = 0; i < t.size(); i++) {
      int key = t.get(i);
      int left = 0;
      int right = n - 1;
      int middle = n / 2;
      while(key != s[middle]) {
        if(key < s[middle]) {
          right = middle - 1;
          middle = (left + right) / 2;
        } else {
          left = middle + 1;
          middle = (left + right) / 2;
        }
        if(left > right) {
          continue loop;
        }
      }
      count++;
    }
    System.out.println(count);
  }
}

