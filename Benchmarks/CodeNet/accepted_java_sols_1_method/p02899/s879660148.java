import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n+1];

    for(int i = 1;i <= n;i++) {
      int x = sc.nextInt();
      data[x] = i;
    }

    for(int i = 1;i <= n;i++) {
      System.out.println(data[i]);
    }

  }

}
