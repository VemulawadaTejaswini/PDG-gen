import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

class Main {
  static int[] C = new int[10001];

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    int current = 0;
    int[] A = new int[size];
    int[] B = new int[size + 1];

    for (int i = 0; i < size; i++) {
      A[i] = Integer.parseInt(sc.next());
      C[A[i]]++;
    }

    for (int i = 1; i < 10001; i++) {
      C[i] += C[i - 1];
    }

    for (int i = size - 1; i > 0; i--) {
      B[--C[A[i]]] = A[i];
    }
    System.out.println(Stream.of(B).map(n -> n.toString()).collect(joining(" ")));
  }
}

