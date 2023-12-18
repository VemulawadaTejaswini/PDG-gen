import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    long sum = 0;

    for (int i = 0; i < N; i++) {
      if (i != N - 1){
        sum += i + 1;
      }
    }

    System.out.println(sum);

  }

}