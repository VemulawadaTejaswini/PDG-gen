import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int r,D;
    int[] x = new int[20];
    r = s.nextInt();
    D = s.nextInt();
    x[0] = s.nextInt();
    for(int i = 0; i < 10 ;i++){
      x[i + 1] = r * x[i] - D;
      System.out.println(x[i + 1]);
    }
  }
}
