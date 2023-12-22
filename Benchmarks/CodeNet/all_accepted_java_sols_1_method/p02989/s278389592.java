import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];

    for (int i = 0; i < N; i++) {
      d[i] = sc.nextInt();
    }
    sc.close();

    Arrays.sort(d);

    int[] a = new int[N/2];
    int[] b = new int[N/2];

    for (int i = 0; i < N/2; i++) {
      a[i] = d[i]; 
    }

    int j = 0;
    for (int i = N/2; i < N; i++) {
      b[j] = d[i];
      j++;
    }

    int count = 0;
    if (a[N/2-1] < b[0]){
      count = b[0] - a[N/2-1];
    }

    System.out.println(count);

  }
  
}