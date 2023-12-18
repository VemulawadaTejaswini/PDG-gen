import java.util.Scanner;
import java.util.Arrays;
import static java.util.stream.Collectors.joining;

class Main {
  final static int k = 10001;
  static int[] C = new int[k];

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int current = 0;
    int[] A = new int[size];
    int[] B = new int[size];

    for (int i = 0; i < size; i++) C[A[i] = Integer.parseInt(sc.next())]++;
    for (int i = 1; i < k; i++) C[i] += C[i - 1];
    for (int i = size - 1; i >= 0; i--) B[--C[A[i]]] = A[i];
    System.out.println(Arrays.stream(B).boxed().map(n -> n.toString()).collect(joining(" ")));
  }
}

