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

    long sum = 0;

    for (int i = 0; i < N; i++) {
      while (a[i] % 2 == 0) {
        sum++;
        a[i] = a[i] / 2; 
      }
    }

    System.out.println(sum);
  
  }

}