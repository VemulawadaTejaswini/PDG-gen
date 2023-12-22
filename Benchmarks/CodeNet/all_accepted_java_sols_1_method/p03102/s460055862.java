import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int C = sc.nextInt();
      sc.nextLine();

      int[] BArray = new int[M];
      int answer = 0;
      for (int i = 0; i < BArray.length; i++) {
        BArray[i] = sc.nextInt();
      }
      sc.nextLine();
      for (int i = 0; i < N; i++) {
        int result = 0;
        for (int j = 0; j < M; j++) {
          result += sc.nextInt() * BArray[j];
        }
        if (0 < (result + C)) {
          answer++;
        }
        sc.nextLine();
      }

      System.out.println(answer);
    }
  }
}