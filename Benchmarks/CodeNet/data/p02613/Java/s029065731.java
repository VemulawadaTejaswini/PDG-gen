import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] C = new int[4];
    for (int i = 0; i < 4; i++)
      C[i] = 0;
    String[] S = new String[N];
    for (int i = 0; i < N; i++) {
      S[i] = sc.next();
    }

    for (int i = 0; i < N; i++) {
      if (S[i].equals("AC"))
        C[0]++;
    }
    for (int i = 0; i < N; i++) {
      if (S[i].equals("WA"))
        C[1]++;
    }
    for (int i = 0; i < N; i++) {
      if (S[i].equals("TLE"))
        C[2]++;
    }
    for (int i = 0; i < N; i++) {
      if (S[i].equals("RE"))
        C[3]++;
    }

    System.out.println(C[0]);
    System.out.println(C[1]);
    System.out.println(C[2]);
    System.out.println(C[3]);
  }
}