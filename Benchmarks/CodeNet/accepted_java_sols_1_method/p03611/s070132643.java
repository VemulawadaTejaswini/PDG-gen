import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] num = new int[200000];
    for (int i = 0; i < N; i++) {
      int tmp = sc.nextInt();
      num[tmp]++;
      num[tmp + 1]++;
      num[tmp + 2]++;
    }
    Arrays.sort(num);
    System.out.println(num[num.length - 1]);
  }
}