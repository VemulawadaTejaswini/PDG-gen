import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] a = new int[N]; 
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
 
    sc.close();

    int answer = 2001000;

    for (int i = -100; i <= 100; i++) {
      
      int cost = 0;
      
      for (int j = 0; j < N; j++) {
        cost += Math.pow(Math.abs(i - a[j]),2);
      }

      answer = Math.min(answer, cost);

    }

    System.out.println(answer);

  }

}