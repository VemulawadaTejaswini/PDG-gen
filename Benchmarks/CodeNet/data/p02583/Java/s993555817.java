import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] bar = new int[n];
    for (int i = 0; i < n; i++) {
      bar[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (bar[i] + bar[j] > bar[k] && bar[j] + bar[k] > bar[i] && bar[k] + bar[i] > bar[j]) {
            if (bar[i] == bar[j] || bar[j] == bar[k] || bar[k] == bar[i]) {
              continue;
            }
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
