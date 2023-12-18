import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int n = sc.nextInt();
      if(n == 0) {
        break;
      }

      int[] scores = new int[100];
      int sum = 0;
      int max = 0;
      int min = 1000;

      for(int i = 0; i < n; i++) {
        int score = sc.nextInt();
        scores[i] = score;
        if(max < score) {
          max = score;
        }
        if(score < min) {
          min = score;
        }
        sum += score;
      }

      int average = (sum - min - max) / (n - 2);
      System.out.println(average);
    }
  }
}