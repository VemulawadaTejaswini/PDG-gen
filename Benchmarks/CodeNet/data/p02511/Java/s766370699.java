import java.util.*;
public class Main { public static void main(String...args) {
Scanner sc = new Scanner(System.in);
for (int n = sc.nextInt(); n > 0; n = sc.nextInt()) {
  String[] ss = new String[n];
  int[][] d = new int[n][];
  for (int i = 0; i < n; i++) {
    ss[i] = sc.next();
    int m = sc.nextInt();
    for(int j = 0; j < m; j++)
      d[i][j] = sc.nextInt();
  }
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  for (int[] is : d)
    for (int j : is)
      if (map.containsKey(j))
        map.put(j, map.get(j) + 1);
      else
        map.put(j, 0);
  int ans = 0;
  int min = 0;
  for (int i : d[0])
    min += N - map.get(i);
  for(int i = 1; i < N; i++) {
    int tmp = 0;
    for (int j : d[i])
      tmp += N - map.get(j);
    if (tmp < min || tmp == min && ss[i].comparTo(ss[ans]) < 0) {
      ans = i;
      min = tmp;
    }
  }
  System.out.println(min + " " + ss[ans);
}}}