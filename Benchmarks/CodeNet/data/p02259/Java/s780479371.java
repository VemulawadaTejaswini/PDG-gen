import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    int count = 0;
    for(int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    for(int i = 0; i < n; i++) {
      for(int j = n - 1; j > i; j--) {
        if(arr.get(j) < arr.get(j - 1)) {
          int v = arr.get(j);
          arr.set(j, arr.get(j - 1));
          arr.set(j - 1, v);
          count++;
        }
      }
      if(i == n - 1) {
        System.out.println(arr.get(i));
        System.out.println(count);
      } else {
        System.out.print(arr.get(i) + " ");
      }
    }
  }
}

