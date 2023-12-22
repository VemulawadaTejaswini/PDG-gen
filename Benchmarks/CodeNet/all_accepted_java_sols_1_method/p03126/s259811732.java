import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int[] count = new int[N];
    for (int i = 0; i < M; i++) {
	  int K = sc.nextInt();
      for (int j = 0; j < K; j++) {
		count[sc.nextInt()-1]++;
      }
    }
    int counter = 0;
    for (int i = 0; i < N; i++) if (count[i] == M) counter++;
    System.out.println(counter);
  }
}