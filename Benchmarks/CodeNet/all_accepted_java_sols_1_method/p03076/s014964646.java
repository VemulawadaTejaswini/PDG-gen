import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<>();
    int plus[][] = new int[5][2];
    for (int i = 0; i < 5; i++) {
      int set = sc.nextInt();
      ar.add(set);
      plus[i][0] = set;
      plus[i][1] = plus[i][0] % 10;
    }
    Arrays.sort(plus, (a, b) -> Integer.compare(a[1], b[1]));
    int ans = 0;
    for (int i = 0; i < 5; i++) {
      if (plus[i][1] == 0) {
        ans += plus[i][0];
        ar.remove(ar.indexOf(plus[i][0]));
      }
    }
    Arrays.sort(plus, (a, b) -> Integer.compare(b[1], a[1]));
    for (int i = 0; i < ar.size(); i++) {
      if (ans % 10 == 0) {
        ans += plus[i][0];
      } else {
        while (ans % 10 != 0) {
          ans += 1;
        }
        ans += plus[i][0];
      }
    }
    System.out.println(ans);
  }
}