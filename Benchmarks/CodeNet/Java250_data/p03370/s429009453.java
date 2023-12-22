import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int X = sc.nextInt();

    int[] m = new int[N];

    for (int i = 0; i < N; i++) {
      m[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;
    int min = 1001;

    for (int i = 0; i < N; i++) {
      count++;
      min = Math.min(min, m[i]);
      X -= m[i];
    }
    
    System.out.println(count + X / min);

  }

}