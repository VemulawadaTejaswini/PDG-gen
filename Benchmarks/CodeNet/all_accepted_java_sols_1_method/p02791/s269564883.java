import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] P = new int[N];
    int count = 0;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<N; i++) {
      P[i] = scan.nextInt();
      if(min > P[i]) {
        count++;
        min = P[i];
      }
    }
    scan.close();

    System.out.println(count);
  }
}