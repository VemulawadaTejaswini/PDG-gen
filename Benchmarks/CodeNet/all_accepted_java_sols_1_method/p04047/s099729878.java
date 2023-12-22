import java.util.*;
public class Main {
public static void main(String...args) {
  final Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] a = new int[N * 2];
  for(int i = 0; i < 2 * N; i++)
    a[i] = sc.nextInt();
  Arrays.sort(a);
  int ans = 0;
  for(int i = 0; i < N; i++)
    ans += a[i * 2];
  System.out.println(ans);
}
}