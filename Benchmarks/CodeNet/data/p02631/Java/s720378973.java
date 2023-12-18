import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    long[] a = new long[N];

    long allXor = 0;
    for(int i = 0; i<N; i++){
      a[i] = sc.nextLong();
      allXor = allXor ^ a[i];
    }

    for(int i = 0; i<N; i++){
      System.out.print(allXor ^ a[i]);
      System.out.print(" ");
    }

    return;
  }
}