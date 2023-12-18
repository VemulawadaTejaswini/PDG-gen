import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = input.nextInt();
    }

    Arrays.sort(a);
    int ans = 0;
    if (a[0] == 1) {
      if (n >= 2 && a[0] == a[1]) {
        ans = 0;
      } else {
        ans = 1;
      }
    } else {
			Set<Integer> removeLater = new HashSet<>();
      List<Integer> unique = new ArrayList<>();
      for (int i = 0; i < n;) {
        int cnt = 1;
        int j = i + 1;
        for (; j < n && a[i] == a[j]; j++) {
          cnt++;
        }
        unique.add(a[i]);
        if (cnt > 1) {
					removeLater.add(a[i]);
        }
        i = j;
      }
      if (unique.size() != 0) {
        int max = unique.get(unique.size() - 1);
        Set<Integer> set = new HashSet<>(unique);
        for (int i = 0; i < unique.size(); i++) {
          int v = unique.get(i);
          for (int j = 2 * v; j <= max; j += v) {
            set.remove(j);
          }
        }
				set.removeAll(removeLater);
        ans = set.size();
      }
    }



    System.out.println(ans);

  }
}