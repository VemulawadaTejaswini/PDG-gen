
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int ans = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }

    System.out.println(sovle(arr, min, max));
    System.out.flush();
    sc.close();
  }

  private static int sovle(int[] arr, int min, int max) {
    int ans = 0;
    Set<Integer> canBeDivided = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      int j = 2;
      while ((j * arr[i]) <= max) {
        canBeDivided.add(j * arr[i]);
        j++;
      }
    }
    Set<Integer> allElem = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (!allElem.contains(arr[i])) {
        allElem.add(arr[i]);
      } else {
        canBeDivided.add(arr[i]);
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (!canBeDivided.contains(arr[i])) {
        ans++;
      }
    }
    return ans;
  }

  private static int solve(int[] arr) {
    int ans = 0;
    boolean[] checked = new boolean[arr.length];
    Arrays.sort(arr);
    for (int i = arr.length - 1; i >= 0; i--) {
      boolean found = false;
      //      for (int j = 0; j < arr.length && !found; j++) {
      int j = 0;
      while (j < arr.length && arr[j] <= arr[i] && !found) {
        if (i != j && arr[i] % arr[j] == 0) {
          //          System.out.println(arr[i]+" "+arr[j]);
          found = true;
        }
        j++;
      }
      if (!found) {
        ans++;
      }
    }
    return ans;
  }
}
