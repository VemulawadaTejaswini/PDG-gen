import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int answer = 0;
    int[] booksA = new int[n + 1];
    int[] booksB = new int[m + 1];
    for (int i = 1; i <= n; i++) {
      booksA[i] = sc.nextInt();
    }
    for (int i = 1; i <= m; i++) {
      booksB[i] = sc.nextInt();
    }
    int fixA = 0;
    int sumTimeA = 0;
    while (fixA < n) {
      if (sumTimeA + booksA[fixA + 1] > k) {
        break;
      } else {
        sumTimeA += booksA[fixA + 1];
        fixA++;
      }
    }
    int posB = 0;
    int sumTimeB = 0;
    for (int a = fixA; a >= 0; a--) {
      while(posB < m){
        if(sumTimeA + sumTimeB + booksB[posB + 1] > k){
          break;
        } else {
          sumTimeB += booksB[posB + 1];
          posB++;
        }
      }
      answer = Math.max(answer, a + posB);
      sumTimeA -= booksA[a];
    }
    System.out.println(answer);
  }
}
