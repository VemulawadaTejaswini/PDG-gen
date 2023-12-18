public class Main {
 public static void main(String...args) {
  final java.util.Scanner sc = new java.util.Scanner(System.in);
   final int s = sc.nextInt();
   final boolean[] visited = new boolean[1000001];
   int ans = 1;
   for(int a = s; !visited[a]; a = a % 2 == 0 ? a / 2 : a * 3 + 1, ans++)
     visited[a] = true;
   System.out.println(ans);
 }
}