import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();

    double answer = 0;
    for(int i = 1; i <= n; i++) {
      int c = 0;
      int s = i;
      while(s < k) {
        s = s*2;
        c++;
      }

      double p = 1;
      for(int j = 0; j < c; j++) {
        p = p/2;
      }
      answer += p/n;
    }

    System.out.println(answer);
  }
}