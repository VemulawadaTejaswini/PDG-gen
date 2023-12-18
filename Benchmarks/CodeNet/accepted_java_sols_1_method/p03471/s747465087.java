import java.util.*;

public class Main {

  public static void main (String[] args) {

     Scanner sc = new Scanner(System.in);
 
    int N = sc.nextInt();
    int Y = sc.nextInt();
 
    sc.close();

    String result = "-1 -1 -1";

     for (int i = 0; i <= N; i++) {

      for (int j = 0; j <= N - i; j++) {

        int k = N - i - j;
        int sum = i * 10000 + j * 5000 + k * 1000;
        if (sum == Y && 0 <= k) {
          result = i + " " + j + " " + k;
          break;
        }

      }

    }

    System.out.println(result);

  }

}