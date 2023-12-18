import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    String[][] A = new String[N][2];
    for (int i = 0; i < N; i++) {
      A[i] = sc.next().split("");
    }

    String[][] bubbledA = bubbleSort(A, N);
    String[][] selectedA = selectionSort(A, N);

    printArray(bubbledA);
    printIsStable(isStable(A, bubbledA));
    printArray(selectedA);
    printIsStable(isStable(A, selectedA));
  }

  private static Map<String, String> cardMap(String[][] a) {
    Map<String, String> cardMap = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      String key = String.valueOf(a[i][1]);
      if (!cardMap.containsKey(key)) {
        cardMap.put(key, "");
      }
      cardMap.put(key, cardMap.get(key) + a[i][0]);
    }
    return cardMap;
  }
  private static boolean isStable(String[][] in, String[][] out) {
    Map<String, String> inMap = cardMap(in);
    Map<String, String> outMap = cardMap(out);

    for (String key : inMap.keySet()) {
      if (!inMap.get(key).equals(outMap.get(key))) {
        return false;
      }
    }

    return true;
  }

  private static String[][] bubbleSort(String[][] a, int n) {
    String[][] copy = copy(a);

    for (int i = 0; i < n; i++) {
      for (int j = n-1; j > i; j--) {
        if (Integer.parseInt(copy[j][1]) < Integer.parseInt(copy[j-1][1])) {
          swap(copy, j, j-1);
        }
      }
    }

    return copy;
  }

  private static String[][] selectionSort(String[][] a, int n) {
    String[][] copy = copy(a);

    for (int i = 0; i < n; i++) {
      int minj = i;
      for (int j = i; j < n; j++) {
        if (Integer.parseInt(copy[j][1]) < Integer.parseInt(copy[minj][1])) {
          minj = j;
        }
      }
      if (i != minj) {
        swap(copy, i, minj);
      }
    }

    return copy;
  }

  private static String[][] copy(String[][] a) {
    String[][] copy = new String[a.length][2];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < 2; j++) {
        copy[i][j] = a[i][j];
      }
    }
    return copy;
  }

  private static void printArray(String[][] a) {
    String joined = Arrays.stream(a).map(e -> e[0] + e[1]).collect(Collectors.joining(" "));
    System.out.println(joined);
  }

  private static void printIsStable(boolean stable) {
    System.out.println(stable ? "Stable" : "Not stable");
  }

  private static void swap(Object[] a, int n, int m) {
    Object tmp = a[n];
    a[n] = a[m];
    a[m] = tmp;
  }
}
