import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    double[] v = new double[N];
    for (int i = 0; i < N; i++) {
      v[i] = sc.nextDouble();
    }
    Arrays.sort(v);

    double sum = 0;
    for (int i = N-1; i >=2 ; --i) {
      sum += v[i] / ((long)1 << N-i );
    }
    sum += (v[0]+v[1])/ ((long)1 << (N-1) );


    System.out.println(sum);


  }

}
