import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = scanner.nextInt();
    int[] m = new int[110];
    int sum = 0;
    int min = 1001;
    int ans = 0;

    for (int i = 1; i <= n; i++)
      m[i] = scanner.nextInt();

    for (int i = 1; i <= n; i++)
      sum += m[i];

    for (int i = 1; i <= n; i++)
      min = Math.min(min, m[i]);

    ans = n + (x - sum) / min;

    System.out.println(ans);
  }
}