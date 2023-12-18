public class Main {
 public static void main(String...args) {
  final java.util.Scanner sc = new java.util.Scanner(System.in);
   final int N = sc.nextInt();
   final int[] h = new int[N];
   for(int i = 0; i < N; i++)
     h[i] = sc.nextInt();
   int ans = 0;
   for(int i = 0, pre = 0; i < N; pre = h[i++])
     ans += Math.max(h[i] - pre, 0);
   System.out.println(ans);
 }
}