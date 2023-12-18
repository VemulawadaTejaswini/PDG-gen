import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    for(int i = 0; i < 3; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int ans = 0;
    if(((a[0] + a[1]) % 2) == 0) {
      ans = ((2 * a[2]) - a[0] - a[1]) / 2;
    } else {
      ans = ((2 * a[2]) - a[0] - a[1] + 3) / 2;
    }
    System.out.println(ans);
  }
}