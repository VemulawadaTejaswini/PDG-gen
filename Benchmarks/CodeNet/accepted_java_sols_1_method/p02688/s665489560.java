import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] countSweets = new int[n + 1];
    for (int i = 0; i < k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        int a = sc.nextInt();
        countSweets[a]++;
      }
    }
    for(int i = 1; i <= n; i++){
      if(countSweets[i] == 0) answer++;
    }
    System.out.println(answer);
  }
}