import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] p = new int[N];
    for(int i=0; i<N; i++){
      p[i] = sc.nextInt();
    }

    Arrays.sort(p);

    int min = 0;
    for(int i=0; i<K; i++){
      min += p[i];
    }

    System.out.println(min);

    return;
  }
}