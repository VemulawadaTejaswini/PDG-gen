import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();
    ArrayList<Character> al = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      al.add(S.charAt(i));
    }
    int ans = 0;
    int i = 0;
    while (i < al.size() - 1) {
      if (al.get(i) != al.get(i + 1)) {
        al.remove(i);
        al.remove(i);
        ans += 2;
        i = 0;
      } else {
        i++;
      }
    }
    System.out.println(ans);
  }
}