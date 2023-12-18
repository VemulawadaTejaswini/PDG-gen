import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    int sum = 0;

    for (int i=0; i<N; i++) {
    	p[i] = sc.nextInt();
    }

    Arrays.sort(p);

    for (int i=0; i<K; i++) {
    	sum += p[i];
    }

    sc.close();
    System.out.println(sum);

  }
}
