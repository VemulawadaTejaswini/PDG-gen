import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int check =0;
    for (int i=0; i<26; i++) {
      for (int j=0; j<15; j++) {
        if (4 * i + 7 * j == N) {
          check++;
        }
      }
    }
    if (check != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}