import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] b = new int[100010];

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      b[a]++;
    }

    sc.close();

    int max = 0;

    for (int i = 0; i < 100010-2; i++) {
      max = Math.max(max, b[i] + b[i+1] + b[i+2]);
    }

    System.out.println(max);

  }

}