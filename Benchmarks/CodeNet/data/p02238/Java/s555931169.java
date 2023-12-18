import java.util.*;
public class Main {
public static void main(String...args) {
final Scanner sc = new Scanner(System.in);
final int n = sc.nextInt();
final boolean[][] matrix = new boolean[n][n];
for(int i = 0; i < n; i++) {
final int u = sc.nextInt();
final int k = sc.nextInt();
for(int j = 0; j < k; j++)
matrix[u-1][sc.nextInt()-1] = true;
}
final int[] begin = new int[n];
final int[] end = new int[n];
final Deque<Integer> deque = new ArrayDeque<Integer>();
deque.offerFirst(0);
for(int t = 1; !deque.isEmpty(); t++) {
final int id = deque.pollFirst();
if(begin[id] > 0) {
end[id] = t;
continue;
}
begin[id] = t;
deque.offerFirst(id);
for(int i = n - 1; i >= 0; i--)
if(matrix[id][i]) deque.offerFirst(i);
}
for(int i = 0; i < n; i++)
System.out.printf("%d %d %d\n", i + 1, begin[i], end[i]);
}
}