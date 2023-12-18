import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int ans = 0;

    if(K >= 0) {
    	ans = (N-1) * (K + 1) + (N - 2) * (N - 1) / 2;
    }
    else if( K < 0 && N > Math.abs(K)) {
    	ans = N * K + (N - 1) * N / 2;
    }
    else if(K < 0 && N <= Math.abs(K)) {
    	ans = (N-1) * K + (N - 2) * (N - 1) / 2;
    }

    System.out.println(ans);
  }
}