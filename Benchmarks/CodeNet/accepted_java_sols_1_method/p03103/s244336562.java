import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    Long[][] AB = new Long[N][2];

    for (int i = 0; i < N; i++) {
      AB[i][0] = sc.nextLong();
      AB[i][1] = sc.nextLong();
    }

    sc.close();

    Arrays.sort(AB, (a, b) -> Long.compare(a[0], b[0]));
    
    long sum = 0;

    int i = 0;

    while (0 < M) {
      if (AB[i][1] < M){
        sum += AB[i][0] * AB[i][1];
        M -= AB[i][1];
      } else {
        sum += AB[i][0] * M;
        M = 0;
      }
      i++;
    }

    System.out.println(sum);

  }

}