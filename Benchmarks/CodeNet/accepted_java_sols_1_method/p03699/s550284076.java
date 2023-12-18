import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    Integer[] s = new Integer[N];

    int sum = 0;

    for (int i = 0; i < N; i++) {
      s[i] = sc.nextInt();
      sum += s[i];
    }

    sc.close();

    Arrays.sort(s);
    
    if (sum % 10 == 0) {
      for (int i = 0; i < N; i++) {
        if (s[i] % 10 != 0 ) {
          sum = sum - s[i];
          break;
        }
      }
      if (sum % 10 == 0) {
        sum = 0;
      }
    }

    System.out.println(sum);

  }

}