import java.util.*;
public class Main {
public static void main(String...args) {
final Scanner sc = new Scanner(System.in);
final int n = sc.nextInt();
final int[][] matrix = new int[n][n];
for(int i = 0; i < n; i++) {
final int u = sc.nextInt();
final int k = sc.nextInt();
for(int j = 0; j < k; j++)
matrix[u-1][sc.nextInt()-1] = 1;
}
final StringBuilder sb = new StringBuilder();
for(int i = 0; i < n; i++) {
for(int j = 0; j < n; j++) {
if(j > 0) sb.append(' ');
sb.append(matrix[i][j]);
}
sb.append('\n');
}
System.out.println(sb);
}
}